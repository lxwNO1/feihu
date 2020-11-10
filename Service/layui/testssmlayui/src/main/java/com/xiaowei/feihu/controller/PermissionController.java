package com.xiaowei.feihu.controller;

import com.xiaowei.feihu.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/queryRightTreeForRole")
    @ResponseBody
    public List<Map<String,Object>> queryRightTreeForRole(Integer organId){
        return permissionService.queryRightTreeForRole(organId);
    }
}
