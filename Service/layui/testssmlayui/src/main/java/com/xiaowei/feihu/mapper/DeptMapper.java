package com.xiaowei.feihu.mapper;

import com.xiaowei.feihu.entity.DeptModel;

import java.util.List;

public interface DeptMapper {
    List<DeptModel> queryDeptList();

    void addDept(DeptModel dept);

    void delDept(Integer id);
}
