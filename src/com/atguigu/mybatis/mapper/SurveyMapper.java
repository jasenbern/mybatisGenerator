package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.Survey;
import java.util.List;

public interface SurveyMapper {
    int deleteByPrimaryKey(Integer surveyId);

    int insert(Survey record);

    Survey selectByPrimaryKey(Integer surveyId);

    List<Survey> selectAll();

    int updateByPrimaryKey(Survey record);
}