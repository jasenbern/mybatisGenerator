package com.atguigu.mybatis.entities;

public class Res {
    private Integer resId;

    private String servletPath;

    private Integer resCode;

    private Integer resPos;

    private Boolean publicRes;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public String getServletPath() {
        return servletPath;
    }

    public void setServletPath(String servletPath) {
        this.servletPath = servletPath == null ? null : servletPath.trim();
    }

    public Integer getResCode() {
        return resCode;
    }

    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }

    public Integer getResPos() {
        return resPos;
    }

    public void setResPos(Integer resPos) {
        this.resPos = resPos;
    }

    public Boolean getPublicRes() {
        return publicRes;
    }

    public void setPublicRes(Boolean publicRes) {
        this.publicRes = publicRes;
    }
}