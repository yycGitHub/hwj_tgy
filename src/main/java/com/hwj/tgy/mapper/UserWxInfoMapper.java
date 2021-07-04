package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.UserWxInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserWxInfoMapper {
    int deleteByPrimary(String id);

    int insert(UserWxInfo record);

    int insertSelective(UserWxInfo record);

    UserWxInfo selectByPrimary(String id);

    int updateByPrimaryKeySelective(UserWxInfo record);

    int updateByPrimaryKey(UserWxInfo record);
}