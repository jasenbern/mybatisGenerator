package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.Question;
import java.util.List;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer questionId);

    int insert(Question record);

    Question selectByPrimaryKey(Integer questionId);

    List<Question> selectAll();

    int updateByPrimaryKey(Question record);
}