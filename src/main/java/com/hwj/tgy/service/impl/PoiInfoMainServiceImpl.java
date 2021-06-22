package com.hwj.tgy.service.impl;

import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.mapper.PoiInfoMainMapper;
import com.hwj.tgy.service.PoiInfoMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoiInfoMainServiceImpl implements PoiInfoMainService {
    @Autowired
    private PoiInfoMainMapper poiInfoMainMapper;

    @Override
    public ResultMessage insertSelective(PoiInfoMain poiInfoMain) {
        poiInfoMainMapper.insertSelective(poiInfoMain);
        ResultMessage resultMessage = new ResultMessage();

        resultMessage.setCode("200");
        resultMessage.setMessage("SUCCESS");
        resultMessage.setResult("");
        return resultMessage;
    }
}
