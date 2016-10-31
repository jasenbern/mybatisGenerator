package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.Answer;
import java.util.List;

public interface AnswerMapper {
    int deleteByPrimaryKey(Integer answerId);

    int insert(Answer record);

    Answer selectByPrimaryKey(Integer answerId);

    List<Answer> selectAll();

    int updateByPrimaryKey(Answer record);
}