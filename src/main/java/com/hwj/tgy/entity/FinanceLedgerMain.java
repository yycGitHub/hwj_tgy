package com.hwj.tgy.entity;

import java.util.Date;

public class FinanceLedgerMain {
    private String id;

    private Integer amounttype;

    private Date amounttime;

    private Double amount;

    private Integer state;

    private Date handleTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getAmounttype() {
        return amounttype;
    }

    public void setAmounttype(Integer amounttype) {
        this.amounttype = amounttype;
    }

    public Date getAmounttime() {
        return amounttime;
    }

    public void setAmounttime(Date amounttime) {
        this.amounttime = amounttime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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