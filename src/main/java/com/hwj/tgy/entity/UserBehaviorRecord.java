package com.hwj.tgy.entity;

import java.util.Date;

/**
 * 用户行为
 */
public class UserBehaviorRecord {
    private String id;

    private String bhaWxid;

    private Integer bhaType;

    private String bhaRemark;

    private Integer state;

    private Date handleTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBhaWxid() {
        return bhaWxid;
    }

    public void setBhaWxid(String bhaWxid) {
        this.bhaWxid = bhaWxid == null ? null : bhaWxid.trim();
    }

    public Integer getBhaType() {
        return bhaType;
    }

    public void setBhaType(Integer bhaType) {
        this.bhaType = bhaType;
    }

    public String getBhaRemark() {
        return bhaRemark;
    }

    public void setBhaRemark(String bhaRemark) {
        this.bhaRemark = bhaRemark == null ? null : bhaRemark.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }
}