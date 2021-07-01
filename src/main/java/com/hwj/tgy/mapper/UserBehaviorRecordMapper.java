package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.UserBehaviorRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBehaviorRecordMapper {

    int insert(UserBehaviorRecord record);

    int insertSelective(UserBehaviorRecord record);

    UserBehaviorRecord selectByPrimary(String id);

    int updateByPrimaryKeySelective(UserBehaviorRecord record);

    int updateByPrimaryKey(UserBehaviorRecord record);
}