package com.cly.dao;

import com.cly.model.Yellow;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface YellowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yellow record);

    int insertSelective(Yellow record);

    List<Yellow> selectByName(@Param("title")String title, @Param("programes")String program);

    int updateByPrimaryKeySelective(Yellow record);

    int updateByPrimaryKey(Yellow record);
}