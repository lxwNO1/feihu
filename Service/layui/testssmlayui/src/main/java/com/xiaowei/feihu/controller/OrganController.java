package com.xiaowei.feihu.controller;

import com.xiaowei.feihu.service.OrganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

//dept and user
@RestController
@RequestMapping("organ")
public class OrganController {
    @Autowired
    private OrganService organService;

    @RequestMapping("queryOrgan")
    public List<Map<String,Object>> queryOrgan(){
        return organService.queryOrgan();
    }
}
