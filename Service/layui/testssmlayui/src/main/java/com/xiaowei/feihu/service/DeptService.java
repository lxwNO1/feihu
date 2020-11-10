package com.xiaowei.feihu.service;

import com.xiaowei.feihu.entity.DeptModel;

import java.util.List;
import java.util.Map;

public interface DeptService {
    List<Map<String, Object>> queryDeptTree();

    void addDept(DeptModel dept);

    void delDept(Integer id);
}
