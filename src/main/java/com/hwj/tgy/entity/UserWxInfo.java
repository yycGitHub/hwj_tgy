package com.hwj.tgy.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name ="user_wx_info")
public class UserWxInfo {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String openid;

    private String unionid;

    private String sessionkey;

    private String nickname;

    private String avatarurl;

    private String gender;

    private String country;

    private String province;

    private String city;


}