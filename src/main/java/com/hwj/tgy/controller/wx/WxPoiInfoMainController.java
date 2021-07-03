package com.hwj.tgy.controller.wx;

import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.service.wx.WxPoiInfoMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WxPoiInfoMainController {

    @Autowired
    private WxPoiInfoMainService wxPoiInfoMainService;

    /**
     * 新增POI
     * @param poiInfoMain
     * @return
     */
    @RequestMapping("/insertSelective")
    public ResultMessage insertSelective(@RequestBody PoiInfoMain poiInfoMain) {
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
        return wxPoiInfoMainService.insertSelective(poiInfoMain);
    }

    /**
     * 导航
     * @param poiInfoMain
     * @return
     */
    @RequestMapping("/navigation")
    public ResultMessage navigation(@RequestBody PoiInfoMain poiInfoMain) {
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
        return wxPoiInfoMainService.insertSelective(poiInfoMain);
    }

}
