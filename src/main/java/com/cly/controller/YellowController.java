package com.cly.controller;

import com.cly.model.Yellow;
import com.cly.service.user.YellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：Chen lingyun
 * The best writter in the world
 **/
@Controller
@RequestMapping("/yellow")
public class YellowController {
    @Autowired
    protected YellowService yellowService;

    @ResponseBody
    @RequestMapping("/search")
    public Object Search(@RequestParam String title, @RequestParam(required = false) String program) {
        List<Yellow> yellow;
        if (program == null) {
            yellow = yellowService.selectByName(title, program);
        } else {
            yellow = yellowService.selectByName(title, program);
        }
        return yellow;
    }
}