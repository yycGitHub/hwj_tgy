package com.hwj.tgy.service.wx.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hwj.tgy.common.utils.GPSConverterUtils;
import com.hwj.tgy.common.utils.PropertiesUtils;
import com.hwj.tgy.common.utils.TgyEnum;
import com.hwj.tgy.common.utils.WebSocketMiniProgramServer;
import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.entity.common.Gps;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.entity.wx.NavigationEntity;
import com.hwj.tgy.mapper.wx.WxPoiInfoMainMapper;
import com.hwj.tgy.service.wx.WxPoiInfoMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class WxPoiInfoMainServiceImpl implements WxPoiInfoMainService {
    @Autowired
    private WxPoiInfoMainMapper wxPoiInfoMainMapper;



    @Transactional
    @Override
    public ResultMessage insertSelective(PoiInfoMain poiInfoMain) {
        wxPoiInfoMainMapper.insert(poiInfoMain);
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setCode("200");
        resultMessage.setMessage("SUCCESS");
        resultMessage.setResult("");
        return resultMessage;
    }

    /**
     * 导航
     * @param navigationEntity
     * @return
     */
    @Override
    public ResultMessage navigationMethod(NavigationEntity navigationEntity) {
        GPSConverterUtils gu = new GPSConverterUtils();
        navigationEntity.setChangeCoordinate(false);
        Gps formGps = new Gps();
        Gps toGps = new Gps();
        //坐标系转换
        if (navigationEntity.isChangeCoordinate()) {
            formGps = gu.getgps84_To_Gcj02(navigationEntity.getFromLatitude(),navigationEntity.getFromLongitude());
            toGps = gu.getgps84_To_Gcj02(navigationEntity.getToLatitude(),navigationEntity.getToLongitude());
        } else {
            formGps.setLat(navigationEntity.getFromLatitude());
            formGps.setLon(navigationEntity.getFromLongitude());
            toGps.setLat(navigationEntity.getToLatitude());
            toGps.setLon(navigationEntity.getToLongitude());
        }
        Object formObj = JSONArray.toJSON(formGps);
        Object toGbj = JSONArray.toJSON(toGps);
        //腾讯路线规划参数
        String form = "from:" + formObj.toString();
        String to = "to:" + toGbj.toString();
        navigationEntity.setFrom(form);
        navigationEntity.setTo(to);
        navigationEntity.setSig(PropertiesUtils.getTgyProperties().getProperty("wx.tencent.key"));
        navigationEntity.setMode(TgyEnum.RoutePlanMode.getNameByIndex(2));
        navigationEntity.setNavigationType(TgyEnum.NavigationType.routePlan.getIndex()+"");
        //websocket通知小程序
        String str = JSONObject.toJSONString(navigationEntity);
        try {
            WebSocketMiniProgramServer.SendMessage(str,navigationEntity.getOpenId());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResultMessage().getResultMessageSuccess(str);
    }
}
