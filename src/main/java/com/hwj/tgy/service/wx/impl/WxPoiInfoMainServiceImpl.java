package com.hwj.tgy.service.wx.impl;

import com.alibaba.fastjson.JSONArray;
import com.hwj.tgy.common.utils.GPSConverterUtils;
import com.hwj.tgy.common.utils.PropertiesUtils;
import com.hwj.tgy.common.utils.TgyEnum;
import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.entity.common.Gps;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.entity.wx.NavigationEntity;
import com.hwj.tgy.mapper.wx.WxPoiInfoMainMapper;
import com.hwj.tgy.service.wx.WxPoiInfoMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Properties;

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

    @Override
    public ResultMessage navigationMethod(NavigationEntity navigationEntity) {
        GPSConverterUtils gu = new GPSConverterUtils();
        //坐标系转换
        Gps formGps = gu.getgps84_To_Gcj02(navigationEntity.getFromLatitude(),navigationEntity.getFromLongitude());
        Gps toGps = gu.getgps84_To_Gcj02(navigationEntity.getToLatitude(),navigationEntity.getToLongitude());
        Object formObj = JSONArray.toJSON(formGps);
        Object toGbj = JSONArray.toJSON(toGps);
        //腾讯路线规划参数
        String form = "from:" + formObj.toString();
        String to = "to:" + toGbj.toString();
        navigationEntity.setFrom(form);
        navigationEntity.setTo(to);
        navigationEntity.setSig(PropertiesUtils.getTgyProperties().getProperty("wx.tencent.key"));
        navigationEntity.setMode(TgyEnum.NavigationMode.getNameByIndex(2));

        return new ResultMessage().getResultMessageSuccess();
    }
}
