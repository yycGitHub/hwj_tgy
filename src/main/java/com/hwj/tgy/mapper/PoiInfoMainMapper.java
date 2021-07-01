package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.PoiInfoMain;
import org.springframework.stereotype.Repository;

@Repository
public interface PoiInfoMainMapper {

    int insert(PoiInfoMain record);

    int insertSelective(PoiInfoMain record);

    PoiInfoMain selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PoiInfoMain record);

    int updateByPrimaryKey(PoiInfoMain record);
}