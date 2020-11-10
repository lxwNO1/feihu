package com.xiaowei.feihu.controller;

import com.xiaowei.feihu.entity.TestUser;
import com.xiaowei.feihu.service.TestService;
import com.xiaowei.feihu.utils.LayuiPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class testcontroller {

    @Autowired
    private TestService testService;

    @RequestMapping("testuser")
    private LayuiPageBean testUser(TestUser userwher){
        LayuiPageBean layui = new LayuiPageBean();
        List<TestUser> user;
        Long usercount;

         user= testService.testUser(userwher);
        usercount= testService.testcountUser(userwher);

        if(user==null ||usercount==null){
            return null;
        }else {
            layui.setData(user);
            layui.setCount(usercount);
            layui.setPage(1);
            layui.setLimit(1);
            layui.calStartIndex();
        }
//        进入用户
        return layui;
    };

    @RequestMapping("testinsertUser")
    private String testinsertUser(TestUser userwher){
        String str= testService.testinsertUser(userwher);
        return "成功"+str;
    };
    @RequestMapping("testupdatetUser")
    private String testupdatetUser(Integer[] ids){
        String str= testService.testupdatetUser(ids);
        return "成功"+str;
    };
    @RequestMapping("testdelUser")
    private String testdelUser(Integer[] ids){
        String str= testService.testdelUser(ids);
        return "成功"+str;
    };

}
