package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.UserVisitorInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserVisitorInfoMapper {
    int insert(UserVisitorInfo record);

    int insertSelective(UserVisitorInfo record);

    UserVisitorInfo selectByPrimary(String id);

    int updateByPrimaryKeySelective(UserVisitorInfo record);

    int updateByPrimaryKey(UserVisitorInfo record);
}