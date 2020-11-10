package com.xiaowei.feihu.service;

import com.xiaowei.feihu.entity.TestUser;

import java.util.List;

public interface TestService {

    List<TestUser> testUser(TestUser userwher);

    String testinsertUser(TestUser userwher);

    String testupdatetUser(Integer[] ids);

    String testdelUser(Integer[] ids);

    Long testcountUser(TestUser userwher);
}
