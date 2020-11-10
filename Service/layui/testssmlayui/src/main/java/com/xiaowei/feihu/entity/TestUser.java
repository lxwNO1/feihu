package com.xiaowei.feihu.entity;

import java.util.Date;

public class TestUser {

    private Integer         id	    ;                    //主键Id
   private  String          userName		;           //用户名
   private  String          realName	;	           //姓名
   private  String          password		;           //密码
   private  String          phone	  ;  	           //手机号
   private  String          email	  ;  	           //邮箱
   private  String          idCard	 ;   	           //身份证号
    private Integer         sex	    ;        	       //性别1男，2女
    private  Date          birthday  ;	               //生日
   private   String         imgUrl	;	               //个人头像
    private   Integer         eduId ;       	       //学历Id
    private     String      provinceCode;	           //省编码
    private     String      cityCode;		           //市编码
    private     String      areaCode	;	           //县编码
    private     Integer    deptId	;	                //部门Id
    private     Date        createTime ; 		        //创建时间
    private    Date         updateTime;	     	        //修改时间
    private String saltCode;

    public String getSaltCode() {
        return saltCode;
    }

    public void setSaltCode(String saltCode) {
        this.saltCode = saltCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getEduId() {
        return eduId;
    }

    public void setEduId(Integer eduId) {
        this.eduId = eduId;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
