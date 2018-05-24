package com.cly.service.user;

import com.cly.model.Yellow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ：Chen lingyun
 * The best writter in the world
 **/
public interface YellowService {
    List<Yellow> selectByName(String title, String program);

}
