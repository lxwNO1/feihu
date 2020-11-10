package com.xiaowei.feihu.controller;

import com.xiaowei.feihu.entity.userall;
import com.xiaowei.feihu.service.userService;
import com.xiaowei.feihu.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaowei
 * @program: xiaowei
 * @Description: 用户管理
 * @create 2020年11月04日 11:21:57
 */
@RestController
@RequestMapping("user")
public class userController {

    @Autowired
    private userService userservice;

    @RequestMapping("selUserAll")
    public userall selUserAll(userall user){
        return userservice.selUserAll(user);
    }

}
