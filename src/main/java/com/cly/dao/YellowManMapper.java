package com.cly.dao;

import com.cly.model.Yellow;
import com.cly.model.YellowMan;
import org.apache.ibatis.annotations.Param;

public interface YellowManMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YellowMan record);

    int insertSelective(YellowMan record);

    YellowMan selectByName(@Param("username")String name, @Param("password")String password);

    int updateByPrimaryKeySelective(YellowMan record);

    int updateByPrimaryKey(YellowMan record);
}