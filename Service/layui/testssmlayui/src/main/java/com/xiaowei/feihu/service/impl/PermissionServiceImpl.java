package com.xiaowei.feihu.service.impl;

import com.xiaowei.feihu.mapper.PermissionMapper;
import com.xiaowei.feihu.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Map<String, Object>> queryRightTreeForRole(Integer organId) {
        return permissionMapper.queryRightTreeForRole(organId);
    }


}
