package com.company.pdr.controller;

import java.util.Map;

public class AnswersResponse {

    public Integer taskId;

    public Map<String, String> userAndRightAnswerMap;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Map<String, String> getUserAndRightAnswerMap() {
        return userAndRightAnswerMap;
    }

    public void setUserAndRightAnswerMap(Map<String, String> userAndRightAnswerMap) {
        this.userAndRightAnswerMap = userAndRightAnswerMap;
    }

    public AnswersResponse(Integer taskId, Map<String, String> userAndRightAnswerMap) {
        this.taskId = taskId;
        this.userAndRightAnswerMap = userAndRightAnswerMap;
    }
}