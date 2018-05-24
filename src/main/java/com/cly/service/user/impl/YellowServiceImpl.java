package com.cly.service.user.impl;

import com.cly.dao.YellowMapper;
import com.cly.model.Yellow;
import com.cly.service.user.YellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：Chen lingyun
 * The best writter in the world
 **/
@Service
public class YellowServiceImpl implements YellowService {
    @Autowired
    YellowMapper yellowMapper;
    @Override
    public List<Yellow> selectByName(String title, String program) {
        return yellowMapper.selectByName(title,program);
    }
}
