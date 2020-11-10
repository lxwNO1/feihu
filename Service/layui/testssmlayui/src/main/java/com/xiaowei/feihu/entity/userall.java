package com.xiaowei.feihu.entity;

import java.util.Date;

/**
 * @author xiaowei
 * @program: xiaowei
 * @Description: 用户所有字段表
 * @create 2020年11月04日 11:47:49
 */
public class userall {

    //主键id
    private Integer id;

    //平台名
    private String platform_name;

    //登录号
    private String login_number;

    //密码
    private String password_number;

    //绑定其他账号
    private String binding;

    //账号创建时间
    private Date create_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlatform_name() {
        return platform_name;
    }

    public void setPlatform_name(String platform_name) {
        this.platform_name = platform_name;
    }
}
