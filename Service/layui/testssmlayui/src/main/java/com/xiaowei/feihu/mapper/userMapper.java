package com.xiaowei.feihu.mapper;


import com.xiaowei.feihu.entity.TestUser;
import com.xiaowei.feihu.entity.userall;

public interface userMapper {
    userall selUserAll(userall user);

    TestUser getUserInfoByUserName(String userName);
}
