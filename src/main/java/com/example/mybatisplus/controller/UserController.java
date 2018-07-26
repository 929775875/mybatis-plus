package com.example.mybatisplus.controller;


import com.example.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cheng123
 * @since 2018-07-25
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
}

