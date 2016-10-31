package com.atguigu.mybatis.entities;

public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private Boolean company;

    private String codeArrStr;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Boolean getCompany() {
        return company;
    }

    public void setCompany(Boolean company) {
        this.company = company;
    }

    public String getCodeArrStr() {
        return codeArrStr;
    }

    public void setCodeArrStr(String codeArrStr) {
        this.codeArrStr = codeArrStr == null ? null : codeArrStr.trim();
    }
}