package com.hwj.tgy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

}