package com.company.pdr.controller;

import java.util.Map;

public class AnswersCheckRequest {

    public Map<Integer, String> answers;

    public Map<Integer, String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Integer, String> answers) {
        this.answers = answers;
    }
}