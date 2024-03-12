package com.example.pojo.vo;

import java.io.Serializable;

public class StuInfoOperateVo implements Serializable {

    private String stuid;
    private String classid;
    private String stuname;
    private String sex;
    private String address;
    private String stutel;
    private String contact;
    private String contacttel;

    private void setStuid(String stuid){
    this.stuid = stuid;
    }

    private void setClassid(String classid){
    this.classid = classid;
    }

    private void setStuname(String stuname){
    this.stuname = stuname;
    }

    private void setSex(String sex){
    this.sex = sex;
    }

    private void setAddress(String address){
    this.address = address;
    }

    private void setStutel(String stutel){
    this.stutel = stutel;
    }

    private void setContact(String contact){
    this.contact = contact;
    }

    private void setContacttel(String contacttel){
    this.contacttel = contacttel;
    }

    private String getStuid(){
    return this.stuid;
    }

    private String getClassid(){
    return this.classid;
    }

    private String getStuname(){
    return this.stuname;
    }

    private String getSex(){
    return this.sex;
    }

    private String getAddress(){
    return this.address;
    }

    private String getStutel(){
    return this.stutel;
    }

    private String getContact(){
    return this.contact;
    }

    private String getContacttel(){
    return this.contacttel;
    }

}
