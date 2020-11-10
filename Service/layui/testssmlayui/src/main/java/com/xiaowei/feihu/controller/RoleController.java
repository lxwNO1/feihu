package com.xiaowei.feihu.controller;

import com.xiaowei.feihu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("selRoleTree")
    public List<Map<String,Object>> selRoleTree(Integer organId){
        return roleService.selRoleTree(organId);
    }
}
