package com.hwj.tgy.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "PoiInfoMain")
public class PoiInfoMain {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

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


}