package com.xiaowei.feihu.service.impl;

import com.xiaowei.feihu.mapper.RoleMapper;
import com.xiaowei.feihu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;


    @Override
    public List<Map<String, Object>> selRoleTree(Integer organId) {
        return roleMapper.selRoleTree(organId);
    }
}
