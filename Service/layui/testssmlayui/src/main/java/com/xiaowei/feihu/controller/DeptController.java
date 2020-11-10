package com.xiaowei.feihu.controller;

import com.xiaowei.feihu.entity.DeptModel;
import com.xiaowei.feihu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

//部门
@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/queryDeptTree")
    public List<Map<String, Object>> queryDeptTree() {
        return deptService.queryDeptTree();

    }
    @RequestMapping("/addDept")
    public void addDept(DeptModel dept){
         deptService.addDept(dept);
    }
    @RequestMapping("/delDept")
    public String delDept(Integer id){
        deptService.delDept(id);
        return "成功";
    }
}
