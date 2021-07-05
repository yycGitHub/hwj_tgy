package com.hwj.tgy.service.wx;

import com.hwj.tgy.entity.UserWxInfo;
import com.hwj.tgy.entity.common.ResultMessage;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface WxUserWxInfoService {

    ResultMessage insertUserWxInfo(UserWxInfo poiInfoMain);

    List<UserWxInfo> selectUserWxInfoList(Example poiInfoMain);

    ResultMessage updateUserWxInfo(UserWxInfo poiInfoMain);
}
