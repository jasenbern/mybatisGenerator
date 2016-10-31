package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.Bag;
import java.util.List;

public interface BagMapper {
    int deleteByPrimaryKey(Integer bagId);

    int insert(Bag record);

    Bag selectByPrimaryKey(Integer bagId);

    List<Bag> selectAll();

    int updateByPrimaryKey(Bag record);
}