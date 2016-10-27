package com.chenxy.controller;

import com.chenxy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 2016/10/25.
 */
@Controller
@RequestMapping(value="/user")
public class UserController {

    @RequestMapping(value="/login")
    public String login(User user){
        return "main";
    }


}
