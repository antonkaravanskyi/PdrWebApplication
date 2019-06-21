package com.company.pdr.controller;

import com.company.pdr.domain.Answer;
import com.company.pdr.domain.Task;
import com.company.pdr.domain.Test;
import com.company.pdr.repos.TaskRepo;
import com.company.pdr.repos.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private TestRepo testRepo;

    @Autowired
    private TaskRepo taskRepo;

    @PostMapping("/tests")
    public String greeting(Map<String, Object> model) {
        return "main";
    }

    @GetMapping("/tests")
    public String main(Map<String, Object> model) {
        Iterable<Test> tests = testRepo.findAll();

        model.put("tests", tests);

        return "main";
    }

    @GetMapping("/tests/{testId}")
    public String getTests(@PathVariable("testId") Integer testId, Map<String, Object> model) {
        Test test = testRepo.findByTestId(testId).orElse(null);

        Iterable<Test> tests = testRepo.findAll();
        model.put("tests", tests);
        model.put("test", test);

        return "main";
    }

    @PostMapping("/answers/check")
    public String checkAnswers(@RequestBody AnswersCheckRequest answersCheckRequest,  Map<String, Object> model) throws Exception {
        List<AnswersResponse> answersResponses = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : answersCheckRequest.getAnswers().entrySet()) {
            Map<String, String> userAndRightAnswerMap = new HashMap<>();
            Task task = taskRepo.findById(entry.getKey()).orElseThrow(Exception::new);

            Answer answer = task.getAnswers().stream().filter(Answer::isCorrect).findFirst().get();
            userAndRightAnswerMap.put("user", entry.getValue());
            userAndRightAnswerMap.put("right", answer.getAnswerName());

            answersResponses.add(new AnswersResponse(entry.getKey(), userAndRightAnswerMap));
        }
        model.put("answerResponses", answersResponses);
        return "main";
    }
}