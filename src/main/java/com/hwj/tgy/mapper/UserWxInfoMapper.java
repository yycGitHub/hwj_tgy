package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.UserWxInfo;
import com.hwj.tgy.common.MysqlBaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserWxInfoMapper extends MysqlBaseMapper<UserWxInfo>{
    int deleteByPrimary(String id);

    int insert(UserWxInfo record);

    int insertSelective(UserWxInfo record);

    UserWxInfo selectByPrimary(String id);

    int updateByPrimaryKeySelective(UserWxInfo record);

    int updateByPrimaryKey(UserWxInfo record);

}