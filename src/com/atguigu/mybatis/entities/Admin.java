package com.atguigu.mybatis.entities;

public class Admin {
    private Integer adminId;

    private String adminName;

    private String adminPwd;

    private String codeArrStr;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    public String getCodeArrStr() {
        return codeArrStr;
    }

    public void setCodeArrStr(String codeArrStr) {
        this.codeArrStr = codeArrStr == null ? null : codeArrStr.trim();
    }
}