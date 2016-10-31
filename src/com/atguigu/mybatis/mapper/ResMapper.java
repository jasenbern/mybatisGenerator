package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.Res;
import java.util.List;

public interface ResMapper {
    int deleteByPrimaryKey(Integer resId);

    int insert(Res record);

    Res selectByPrimaryKey(Integer resId);

    List<Res> selectAll();

    int updateByPrimaryKey(Res record);
}