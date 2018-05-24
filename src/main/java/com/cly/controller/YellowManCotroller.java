package com.cly.controller;

import com.cly.model.YellowMan;
import com.cly.service.user.YellowManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：Chen lingyun
 * The best writter in the world
 **/
@Controller

@RequestMapping(value = "/user")
public class YellowManCotroller {
    @Autowired
    YellowManService yellowManService;
    @Autowired
    protected  HttpServletRequest request;
    @ResponseBody
    @RequestMapping("/login")
    public Object Login(@RequestParam String name, @RequestParam String password) {
        if (name==null||password==null)return "用户GG";
        YellowMan yellowMan = yellowManService.Login(name, password);
        if (yellowMan == null) {
            return "用户GG";
        } else {
            request.getSession().setAttribute("loginUser",yellowMan);
          return yellowMan;
        }
    }
    @RequestMapping("/error")
    public Object Error() {
       return 404;
    }
}
