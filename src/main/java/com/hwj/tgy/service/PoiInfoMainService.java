package com.hwj.tgy.service;

import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.entity.common.ResultMessage;
import org.springframework.stereotype.Service;

@Service
public interface PoiInfoMainService {
    ResultMessage insertSelective(PoiInfoMain poiInfoMain);
}
