package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.UserManagerInfo;
import com.hwj.tgy.entity.UserManagerInfoKey;
import org.springframework.stereotype.Repository;

@Repository
public interface UserManagerInfoMapper {
    int insert(UserManagerInfo record);

    int insertSelective(UserManagerInfo record);

    UserManagerInfo selectByPrimary(UserManagerInfoKey key);

    int updateByPrimaryKeySelective(UserManagerInfo record);

    int updateByPrimaryKey(UserManagerInfo record);
}