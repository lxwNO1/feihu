package com.xiaowei.feihu.utils;

//异常返回类
public class CommonReturn {

    private Integer code;
    private String msg;
    private Object data;

    private CommonReturn(Integer code, String msg){
        this.code=code;
        this.msg=msg;
    }
    private CommonReturn(Integer code, String msg, Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }


    public static CommonReturn success(){
        return new CommonReturn(200,"操作成功");
    }
    public static CommonReturn success(ReturnCode returnCode){
        return new CommonReturn(returnCode.getCode(),returnCode.getMsg());
    }
    public static CommonReturn success(ReturnCode returnCode,Object data){
        return new CommonReturn(returnCode.getCode(),returnCode.getMsg(),data);
    }
    public static CommonReturn success(Object data){
        return new CommonReturn(200,"操作成功",data);
    }

    public static CommonReturn error(){
        return new CommonReturn(500,"操作失败");
    }
    public static CommonReturn error(Object data){
        return new CommonReturn(500,"操作失败",data);
    }
    public static CommonReturn error(ReturnCode returnCode){
        return new CommonReturn(returnCode.getCode(),returnCode.getMsg());
    }

    public static CommonReturn error(ReturnCode returnCode,Object data){
        return new CommonReturn(returnCode.getCode(),returnCode.getMsg(),data);
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}
