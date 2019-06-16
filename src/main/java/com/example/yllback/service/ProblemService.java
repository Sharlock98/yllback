package com.example.yllback.service;

import com.example.yllback.entity.CommonProblem;

import java.util.List;

public interface ProblemService {
    List<CommonProblem> getAll();
    CommonProblem getQuestionById(int id);
    boolean addQuestion(CommonProblem commonProblem);
    boolean deleteQuestion(int id);
    boolean motifyQuestion(CommonProblem commonProblem);
}
