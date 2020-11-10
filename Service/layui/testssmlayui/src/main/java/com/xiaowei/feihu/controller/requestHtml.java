package com.xiaowei.feihu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaowei
 * @program: xiaowei
 * @Description: 统一在这请求到html里
 * @create 2020年11月04日 17:37:42
 */
@Controller
public class requestHtml {

//主页
    @RequestMapping("index")
    public String index(){
        System.out.println("主页index到位");
        return "index";
    };

//用户管理页面
    @RequestMapping("user")
    public String user(){
        System.out.println("主页user到位");
        return "user";
    };

    @RequestMapping("testuser")
    public String testuser(){
        System.out.println("主页testuser到位");
        return "testuser";}

    @RequestMapping("kao")
    public String kao(){
        System.out.println("主页kao到位");
        return "kao";}

//    普通用户页面
    @RequestMapping("adminuser")
    public String adminuser(){
        System.out.println("主页adminuser到位");
        return "adminuser";}

//    登录页面
    @RequestMapping("login")
    public String login(){
        System.out.println("主页login到位");
        return "login";}

    @RequestMapping("insuser")
    public String insuser(){
        System.out.println("主页insuser到位");
        return "insuser";}
    @RequestMapping("layuitestuser")
    public String layuitestuser(){ System.out.println("主页layuitestuser到位"); return "layuitestuser";}

}
