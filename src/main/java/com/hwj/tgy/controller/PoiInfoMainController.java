package com.hwj.tgy.controller;

import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.service.PoiInfoMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/poiinfomain")
public class PoiInfoMainController {
    @Autowired
    private PoiInfoMainService poiInfoMainService;

    @PostMapping("/insertSelective")
    public ResultMessage insertSelective(@RequestBody PoiInfoMain poiInfoMain) {
        return poiInfoMainService.insertSelective(poiInfoMain);
    }

}
