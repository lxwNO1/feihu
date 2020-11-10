package com.xiaowei.feihu.service;

import java.util.List;
import java.util.Map;

public interface RoleService {
    List<Map<String, Object>> selRoleTree(Integer organId);
}
