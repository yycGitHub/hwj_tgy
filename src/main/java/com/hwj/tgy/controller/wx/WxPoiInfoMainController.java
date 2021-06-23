package com.hwj.tgy.controller.wx;

import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.service.wx.WxPoiInfoMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WxPoiInfoMainController {

    @Autowired
    private WxPoiInfoMainService wxPoiInfoMainService;

    @RequestMapping("/insertSelective")
    public ResultMessage insertSelective( PoiInfoMain poiInfoMain) {
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
        return wxPoiInfoMainService.insertSelective(poiInfoMain);
    }

}