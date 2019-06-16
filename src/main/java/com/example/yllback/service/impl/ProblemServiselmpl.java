package com.example.yllback.service.impl;

import com.example.yllback.dao.CommonProblemDao;
import com.example.yllback.entity.CommonProblem;
import com.example.yllback.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiselmpl implements ProblemService{
    @Autowired
    private CommonProblemDao dao;

    @Override
    public List<CommonProblem> getAll() {
        return dao.selectAll();
    }

    @Override
    public CommonProblem getQuestionById(int id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public boolean addQuestion(CommonProblem commonProblem) {
        return dao.insert(commonProblem) > 0;
    }

    @Override
    public boolean deleteQuestion(int id) {
        return dao.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean motifyQuestion(CommonProblem commonProblem) {
        return dao.updateByPrimaryKeySelective(commonProblem)>0;
    }
}
