package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.CameraJuehuataRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface CameraJuehuataRecordMapper {

    int insert(CameraJuehuataRecord record);

    int insertSelective(CameraJuehuataRecord record);

    CameraJuehuataRecord selectByPrimary(String id);

    int updateByPrimaryKeySelective(CameraJuehuataRecord record);

    int updateByPrimaryKey(CameraJuehuataRecord record);
}