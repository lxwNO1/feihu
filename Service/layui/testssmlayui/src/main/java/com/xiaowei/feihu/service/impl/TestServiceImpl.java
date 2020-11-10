package com.xiaowei.feihu.service.impl;

import com.xiaowei.feihu.entity.TestUser;
import com.xiaowei.feihu.mapper.TestUserMapper;
import com.xiaowei.feihu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestUserMapper testUsermapper;
    @Override
    public List<TestUser> testUser(TestUser userwher) {
        return testUsermapper.userwheres();

    }

    @Override
    public String testinsertUser(TestUser userwher) {
//        Integer sda=testUsermapper.testinsertUser(userwher);
//        return sda !=0 ?"成功":"失败";
        return null;

    }

    @Override
    public String testupdatetUser(Integer[] ids) {
//        Integer sda=testUsermapper.testupdatetUser(ids);
//        return sda !=0 ?"成功":"失败";
        return null;

    }

    @Override
    public String testdelUser(Integer[] ids) {
//        Integer sda=testUsermapper.testdelUser();
//        return sda !=0 ?"成功":"失败";
        return null;
    }

    @Override
    public Long testcountUser(TestUser userwher) {
        return testUsermapper.testcountUser();
    }
}
