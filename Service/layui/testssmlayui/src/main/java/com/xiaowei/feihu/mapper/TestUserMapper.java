package com.xiaowei.feihu.mapper;

import com.xiaowei.feihu.entity.TestUser;

import java.util.List;

public interface TestUserMapper {
    List<TestUser> userwheres();

    Long testcountUser( );

//    Integer testinsertUser(TestUser userwher);
//
//
//    Integer testupdatetUser(Integer[] ids);
//
//    Integer testdelUser();
}
