package com.cly.dao;

import com.cly.model.Yellow;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface YellowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yellow record);

    int insertSelective(Yellow record);

    Yellow selectByName(@Param("username")String name,@Param("password")String password);

    int updateByPrimaryKeySelective(Yellow record);

    int updateByPrimaryKey(Yellow record);
}