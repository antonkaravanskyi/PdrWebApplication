package com.company.pdr.domain;


import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "answer_name")
    private String answerName;

    @Column(name = "correct")
    private boolean correct;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable=false)
    private Task task;

    public Answer() {

    }

    public Answer(String answerName, boolean correct, Task task) {
        this.answerName = answerName;
        this.correct = correct;
        this.task = task;
    }

    public String getAnswerName() {
        return answerName;
    }

    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
