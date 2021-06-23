package com.hwj.tgy.service.wx;

import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.entity.common.ResultMessage;
import org.springframework.stereotype.Service;

@Service
public interface WxPoiInfoMainService {
    ResultMessage insertSelective(PoiInfoMain poiInfoMain);
}
