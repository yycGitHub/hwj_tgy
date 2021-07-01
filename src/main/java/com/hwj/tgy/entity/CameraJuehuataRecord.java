package com.hwj.tgy.entity;

import java.util.Date;

public class CameraJuehuataRecord {
    private String id;

    private String jhtWxid;

    private Double jhtAmount;

    private Integer jhtCreamaid;

    private String jhtCameraname;

    private String jhtCompeteid;

    private Integer jhtCompetestate;

    private Integer state;

    private Date handleTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJhtWxid() {
        return jhtWxid;
    }

    public void setJhtWxid(String jhtWxid) {
        this.jhtWxid = jhtWxid == null ? null : jhtWxid.trim();
    }

    public Double getJhtAmount() {
        return jhtAmount;
    }

    public void setJhtAmount(Double jhtAmount) {
        this.jhtAmount = jhtAmount;
    }

    public Integer getJhtCreamaid() {
        return jhtCreamaid;
    }

    public void setJhtCreamaid(Integer jhtCreamaid) {
        this.jhtCreamaid = jhtCreamaid;
    }

    public String getJhtCameraname() {
        return jhtCameraname;
    }

    public void setJhtCameraname(String jhtCameraname) {
        this.jhtCameraname = jhtCameraname == null ? null : jhtCameraname.trim();
    }

    public String getJhtCompeteid() {
        return jhtCompeteid;
    }

    public void setJhtCompeteid(String jhtCompeteid) {
        this.jhtCompeteid = jhtCompeteid == null ? null : jhtCompeteid.trim();
    }

    public Integer getJhtCompetestate() {
        return jhtCompetestate;
    }

    public void setJhtCompetestate(Integer jhtCompetestate) {
        this.jhtCompetestate = jhtCompetestate;
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