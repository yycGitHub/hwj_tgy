package com.hwj.tgy.entity;

import java.util.Date;

public class PoiInfoMain {
    private String id;

    private String poiName;

    private Integer poiType;

    private String poiIntroduce;

    private String poiLon;

    private String poiLat;

    private String poiRoam;

    private String poiPanorama;

    private String poiIcon;

    private String poiPhone;

    private Integer state;

    private Date handleTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName == null ? null : poiName.trim();
    }

    public Integer getPoiType() {
        return poiType;
    }

    public void setPoiType(Integer poiType) {
        this.poiType = poiType;
    }

    public String getPoiIntroduce() {
        return poiIntroduce;
    }

    public void setPoiIntroduce(String poiIntroduce) {
        this.poiIntroduce = poiIntroduce == null ? null : poiIntroduce.trim();
    }

    public String getPoiLon() {
        return poiLon;
    }

    public void setPoiLon(String poiLon) {
        this.poiLon = poiLon == null ? null : poiLon.trim();
    }

    public String getPoiLat() {
        return poiLat;
    }

    public void setPoiLat(String poiLat) {
        this.poiLat = poiLat == null ? null : poiLat.trim();
    }

    public String getPoiRoam() {
        return poiRoam;
    }

    public void setPoiRoam(String poiRoam) {
        this.poiRoam = poiRoam == null ? null : poiRoam.trim();
    }

    public String getPoiPanorama() {
        return poiPanorama;
    }

    public void setPoiPanorama(String poiPanorama) {
        this.poiPanorama = poiPanorama == null ? null : poiPanorama.trim();
    }

    public String getPoiIcon() {
        return poiIcon;
    }

    public void setPoiIcon(String poiIcon) {
        this.poiIcon = poiIcon == null ? null : poiIcon.trim();
    }

    public String getPoiPhone() {
        return poiPhone;
    }

    public void setPoiPhone(String poiPhone) {
        this.poiPhone = poiPhone == null ? null : poiPhone.trim();
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