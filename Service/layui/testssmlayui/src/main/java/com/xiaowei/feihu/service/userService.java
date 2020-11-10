package com.xiaowei.feihu.service;

import com.xiaowei.feihu.entity.TestUser;
import com.xiaowei.feihu.entity.userall;

public interface userService {
     TestUser getUserInfoByUserName(String userName);

    userall selUserAll(userall user);
}
