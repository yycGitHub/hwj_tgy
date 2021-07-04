package com.hwj.tgy.entity;

import java.util.Date;

public class UserWxInfo {
    private String id;

    private String openid;

    private Integer unionid;

    private String sessionkey;

    private Integer nickname;

    private Date avatarurl;

    private String gender;

    private String country;

    private String province;

    private String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Integer getUnionid() {
        return unionid;
    }

    public void setUnionid(Integer unionid) {
        this.unionid = unionid;
    }

    public String getSessionkey() {
        return sessionkey;
    }

    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey == null ? null : sessionkey.trim();
    }

    public Integer getNickname() {
        return nickname;
    }

    public void setNickname(Integer nickname) {
        this.nickname = nickname;
    }

    public Date getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(Date avatarurl) {
        this.avatarurl = avatarurl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }
}