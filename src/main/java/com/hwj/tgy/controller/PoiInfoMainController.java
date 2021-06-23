package com.hwj.tgy.controller;

import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.service.PoiInfoMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoiInfoMainController {

    @Autowired
    private PoiInfoMainService poiInfoMainService;

    @RequestMapping("/insertSelective")
    public ResultMessage insertSelective( PoiInfoMain poiInfoMain) {
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
        return poiInfoMainService.insertSelective(poiInfoMain);
    }

}
