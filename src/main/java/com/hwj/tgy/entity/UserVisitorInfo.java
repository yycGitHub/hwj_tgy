package com.hwj.tgy.entity;

import java.util.Date;

public class UserVisitorInfo {
    private String id;

    private String cusName;

    private String cusSex;

    private String cusNation;

    private Date cusBirth;

    private String cusAddress;

    private String cusIdentity;

    private Date cusVailddate;

    private Date cusInvailddate;

    private Integer state;

    private Date handleTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getCusSex() {
        return cusSex;
    }

    public void setCusSex(String cusSex) {
        this.cusSex = cusSex == null ? null : cusSex.trim();
    }

    public String getCusNation() {
        return cusNation;
    }

    public void setCusNation(String cusNation) {
        this.cusNation = cusNation == null ? null : cusNation.trim();
    }

    public Date getCusBirth() {
        return cusBirth;
    }

    public void setCusBirth(Date cusBirth) {
        this.cusBirth = cusBirth;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress == null ? null : cusAddress.trim();
    }

    public String getCusIdentity() {
        return cusIdentity;
    }

    public void setCusIdentity(String cusIdentity) {
        this.cusIdentity = cusIdentity == null ? null : cusIdentity.trim();
    }

    public Date getCusVailddate() {
        return cusVailddate;
    }

    public void setCusVailddate(Date cusVailddate) {
        this.cusVailddate = cusVailddate;
    }

    public Date getCusInvailddate() {
        return cusInvailddate;
    }

    public void setCusInvailddate(Date cusInvailddate) {
        this.cusInvailddate = cusInvailddate;
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