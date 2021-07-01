package com.hwj.tgy.entity;

import java.util.Date;

public class UserManagerInfo extends UserManagerInfoKey {
    private Integer state;

    private Date handleTime;

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