package com.song.books.entity;

import java.util.Date;

/**
 *
 */
public class Auth {
    private Long id;
    private String authPath;//接口路径
    private boolean status;//权限状态
    private String desc;//权限描述，是个什么权限干嘛用的
    private Date addTime;//添加时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthPath() {
        return authPath;
    }

    public void setAuthPath(String authPath) {
        this.authPath = authPath;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
