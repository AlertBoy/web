package com.cly.service.user.impl;

import com.cly.dao.YellowManMapper;
import com.cly.model.YellowMan;
import com.cly.service.user.YellowManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.github.pagehelper.PageHelper;

/**
 * @author ：Chen lingyun
 * The best writter in the world
 **/
@Service
public class YellowManServiceImpl implements YellowManService {

    @Autowired
    YellowManMapper yellowManMapper;

    @Override
    public YellowMan Login(String name, String password) {

        return yellowManMapper.selectByName(name,password);
    }
}
