package com.xiaowei.feihu.service.impl;

import com.xiaowei.feihu.entity.TestUser;
import com.xiaowei.feihu.entity.userall;
import com.xiaowei.feihu.mapper.userMapper;
import com.xiaowei.feihu.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaowei
 * @program: xiaowei
 * @Description: user 业务层
 * @create 2020年11月04日 12:15:46
 */
@Service
public class userServiceImpl implements userService {

    @Autowired
    private userMapper usermapper;


    @Override
    public TestUser getUserInfoByUserName(String userName) {
        return usermapper.getUserInfoByUserName(userName);
    }

    @Override
    public userall selUserAll(userall user) {
        return usermapper.selUserAll(user);
    }

}
