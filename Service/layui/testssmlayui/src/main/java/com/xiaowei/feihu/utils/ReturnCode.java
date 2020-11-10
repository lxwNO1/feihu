package com.xiaowei.feihu.utils;

//异常信息
public enum ReturnCode {
    SUCCESS(200,"操作成功"),
    ERROR(500,"操作失败"),
    LOGIN_SUCCESS(2001,"登录成功"),
    USERNAME_PASSWORD_ISNULL(2002,"用户或者密码不能为空"),
    ACCOUNT_NOTEXIST(2003,"账号不存在"),
    ACCOUNT_DISABLED(2004,"账号已经无效了"),
    PASSWORD_ERROR(2005,"密码错误"),
    NO_PERMISSION(5001,"用户没有这个权限"),
    UPLOAD_SUCCESS(0,"图片上传成功");

    private Integer code;
    private String  msg;
    private ReturnCode(Integer code, String msg){
        this.code=code;
        this.msg=msg;
    }
    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
