package com.hwj.tgy.entity.wx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 腾讯地图路线规划
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NavigationEntity {
    //微信ID
    private String wxid;
    //起始纬度
    private double fromLatitude;
    //起始经度
    private double fromLongitude;
    //起始位置坐标
    private String from;
    //目标纬度
    private double toLatitude;
    //目标经度
    private double toLongitude;
    //目标位置坐标
    private String to;
    //路线规划选择
    private String mode;
    //签名
    private String sig;
}
