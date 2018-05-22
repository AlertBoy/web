package com.cly.controller;

import com.cly.service.YellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * @author ：Chen lingyun
 * The best writter in the world
 **/
@Controller
@RequestMapping(value = "/ye")
public class YellowController {
    @Autowired
    YellowService yellowService;

    @ResponseBody
    @RequestMapping(value = { "list.json", "" })
    public Object findAllUser(ServletRequest request, ServletResponse response){

        return yellowService.query();
    }
}
