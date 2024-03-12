package com.example.pojo.dto;

public class StuInfoDto {
    public String stuID;
    public String stuName;
    public String sex;
    public String classID;

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String toString() {
        return "StuInfoDto{" +
                "stuID=" + stuID +
                ",stuName=" + stuName +
                ",sex='" + sex + '\'' +
                ",classID='" + classID + '\'' +
                '}';}
}
