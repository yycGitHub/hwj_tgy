package com.hwj.tgy.service.wx.impl;

import com.hwj.tgy.entity.UserWxInfo;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.mapper.UserWxInfoMapper;
import com.hwj.tgy.service.wx.WxUserWxInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxUserWxInfoServiceImpl implements WxUserWxInfoService {
    @Autowired
    private UserWxInfoMapper userWxInfoMapper;

    /**
     * 保存微信用户信息
     * @param poiInfoMain
     * @return
     */
    @Override
    public ResultMessage insertUserWxInfo(UserWxInfo poiInfoMain) {
        userWxInfoMapper.insertSelective(poiInfoMain);
        return ResultMessage.getResultMessageSuccess();
    }
}
