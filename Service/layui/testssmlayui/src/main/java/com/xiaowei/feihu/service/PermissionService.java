package com.xiaowei.feihu.service;

import java.util.List;
import java.util.Map;

public interface PermissionService {
    List<Map<String, Object>> queryRightTreeForRole(Integer organId);
}
