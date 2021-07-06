package com.hwj.tgy.service.wx.impl;

import com.hwj.tgy.entity.UserWxInfo;
import com.hwj.tgy.entity.common.ResultMessage;
import com.hwj.tgy.mapper.UserWxInfoMapper;
import com.hwj.tgy.service.wx.UserWxInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserWxInfoServiceImpl implements UserWxInfoService {
    @Autowired
    private UserWxInfoMapper userWxInfoMapper;

    /**
     * 保存微信用户信息
     * @param poiInfoMain
     * @return
     */
    @Override
    public ResultMessage insertUserWxInfo(UserWxInfo poiInfoMain) {
        if (poiInfoMain.getOpenid()==null||poiInfoMain.getOpenid().isEmpty()) {
            return ResultMessage.getResultMessageFail();
        }
        userWxInfoMapper.insertSelective(poiInfoMain);
        return ResultMessage.getResultMessageSuccess();
    }

    @Override
    public ResultMessage updateUserWxInfo(UserWxInfo userWxInfo) {
        userWxInfoMapper.updateByPrimaryKey(userWxInfo);
        return ResultMessage.getResultMessageSuccess();
    }

    @Override
    public List<UserWxInfo> selectByExample(UserWxInfo userWxInfo) {
        Example example = new Example(UserWxInfo.class);
        example.createCriteria().andEqualTo("openid",userWxInfo.getOpenid());
        return userWxInfoMapper.selectByExample(example);
    }


}
