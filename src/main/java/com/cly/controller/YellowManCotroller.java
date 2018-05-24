package com.cly.controller;

import com.cly.model.YellowMan;
import com.cly.service.user.YellowManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：Chen lingyun
 * The best writter in the world
 **/
@Controller

@RequestMapping(value = "/user")
public class YellowManCotroller {
    @Autowired
    YellowManService yellowManService;

    @ResponseBody
    @PostMapping("/add")
    public Object Login(@RequestParam(required = true) String name, @RequestParam(required = true) String password) {
        YellowMan yellowMan = yellowManService.Login(name, password);
        if (yellowMan == null) {
            return "用户GG";

        } else {
          return yellowMan;
        }
    }
}
