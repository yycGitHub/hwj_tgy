package com.hwj.tgy.service.wx.impl;

import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.mapper.wx.WxPoiInfoMainMapper;
import com.hwj.tgy.service.wx.WxPoiInfoMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
