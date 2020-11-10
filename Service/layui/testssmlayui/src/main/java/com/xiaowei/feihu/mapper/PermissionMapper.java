package com.xiaowei.feihu.mapper;

import java.util.List;
import java.util.Map;

public interface PermissionMapper {
    List<Map<String, Object>> queryRightTreeForRole(Integer organId);
}
