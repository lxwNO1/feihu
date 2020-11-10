package com.xiaowei.feihu.controller;

import com.xiaowei.feihu.utils.CommonReturn;
import com.xiaowei.feihu.utils.ReturnCode;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xiaowei.feihu.service.loginService;


/**
 * @author xiaowei
 * @program: xiaowei
 * @Description: 登录相关类
 * @create 2020年11月04日 10:40:21
 */
@RestController
@RequestMapping("login")
public class loginController {



    @GetMapping("login")
    public CommonReturn login(@RequestParam("userName") String userName, @RequestParam("password")String password){
        if(StringUtils.isBlank(userName) || StringUtils.isBlank(password)){
            return CommonReturn.error(ReturnCode.USERNAME_PASSWORD_ISNULL);
        }
        UsernamePasswordToken token=new UsernamePasswordToken(userName,password);
        try {
            Subject subject= SecurityUtils.getSubject();
            subject.login(token);
            return CommonReturn.success(ReturnCode.LOGIN_SUCCESS);
        }catch (UnknownAccountException e){
            return CommonReturn.error(ReturnCode.ACCOUNT_NOTEXIST);
        }catch(DisabledAccountException e){
            return CommonReturn.error(ReturnCode.ACCOUNT_DISABLED);
        }catch (IncorrectCredentialsException e){
            return CommonReturn.error(ReturnCode.PASSWORD_ERROR);
        }
    }


}