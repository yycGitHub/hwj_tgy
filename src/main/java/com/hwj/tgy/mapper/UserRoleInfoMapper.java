package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.UserRoleInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleInfoMapper {
    int insert(UserRoleInfo record);

    int insertSelective(UserRoleInfo record);

    UserRoleInfo selectByPrimary(String id);

    int updateByPrimaryKeySelective(UserRoleInfo record);

    int updateByPrimaryKey(UserRoleInfo record);
}