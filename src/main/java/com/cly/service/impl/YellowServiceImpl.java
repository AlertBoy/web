package com.cly.service.impl;

import com.cly.dao.YellowObjectMapper;
import com.cly.model.YellowObject;
import com.cly.service.YellowService;
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
    YellowObjectMapper yellowObjectMapper;
    @Override
    public List<YellowObject> query() {
        return    yellowObjectMapper.selectByPrimaryKey();
    }
}
