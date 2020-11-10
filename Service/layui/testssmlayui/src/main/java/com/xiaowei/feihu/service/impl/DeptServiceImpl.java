package com.xiaowei.feihu.service.impl;

import com.xiaowei.feihu.entity.DeptModel;
import com.xiaowei.feihu.mapper.DeptMapper;
import com.xiaowei.feihu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Map<String, Object>> queryDeptTree() {
        List<DeptModel> deptList=deptMapper.queryDeptList();
        return getTree(deptList,0);
//        return  null;
    }

    private  List<Map<String, Object>> getTree(List<DeptModel> deptList,Integer pid){
        List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
        deptList.forEach(deptModel -> {
            Map<String, Object> map=null;
            if(pid.equals(deptModel.getPid())){
                map=new HashMap<>();
                map.put("id",deptModel.getId());
                map.put("name",deptModel.getDeptName());
                if(0 == deptModel.getPid()){
                    map.put("iconClose","/commons/orgimg/organ_close.png");
                    map.put("iconOpen","/commons/orgimg/organ_open.png");
                }else{
                    map.put("icon","/commons/orgimg/dept2.png");
                }

                map.put("children",getTree(deptList,deptModel.getId()));
            }
            if(map != null){
                list.add(map);
            }
        });
        return list;
    }

    @Override
    public void addDept(DeptModel dept) {
         deptMapper.addDept(dept);
    }

    @Override
    public void delDept(Integer id) {
        deptMapper.delDept(id);
    }
}
