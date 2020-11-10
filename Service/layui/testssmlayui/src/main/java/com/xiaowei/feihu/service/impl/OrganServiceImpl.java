package com.xiaowei.feihu.service.impl;

import com.xiaowei.feihu.entity.Organ;
import com.xiaowei.feihu.mapper.OrganMapper;
import com.xiaowei.feihu.service.OrganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrganServiceImpl implements OrganService {
    @Autowired
    private OrganMapper organMapper;

    @Override
    public List<Map<String, Object>> queryOrgan() {
        List<Organ> organList=organMapper.queryOrganList();
        List<Map<String, Object>> dept_0 = getOrganTree(organList, "dept_0");
        return dept_0;
    }
    private  List<Map<String, Object>> getOrganTree( List<Organ> organList,String pid){
        List<Map<String, Object>> list=new ArrayList<>();
        organList.forEach(organ -> {
            Map<String, Object> map=null;
            if(pid.equals(organ.getPid())){
                map=new HashMap<>();
                map.put("id",organ.getId());
                map.put("name",organ.getOrganName());
                map.put("type",organ.getType());
                if("dept_0" .equals(organ.getPid()) ){
                    map.put("iconClose","/commons/orgimg/organ_close.png");
                    map.put("iconOpen","/commons/orgimg/organ_open.png");
                }else if(organ.getType() == 1){
                    map.put("icon","/commons/orgimg/dept2.png");
                }else{
                    if(organ.getSex() == 1){
                        map.put("icon","/commons/orgimg/nan.png");
                    }else{
                        map.put("icon","/commons/orgimg/nv.png");
                    }
                }
                map.put("children",getOrganTree(organList,organ.getId()));
            }

            if(map != null){
                list.add(map);
            }
        });
        return list;

    }
}
