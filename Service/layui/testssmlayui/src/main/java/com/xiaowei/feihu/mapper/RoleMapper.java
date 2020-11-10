package com.xiaowei.feihu.mapper;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    List<Map<String, Object>> selRoleTree(Integer organId);
}
