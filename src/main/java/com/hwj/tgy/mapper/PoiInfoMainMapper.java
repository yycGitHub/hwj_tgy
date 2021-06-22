package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.PoiInfoMain;
import com.hwj.tgy.mapper.common.MysqlBaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface PoiInfoMainMapper extends MysqlBaseMapper<PoiInfoMain> {
    int deleteByPrimaryKey(String id);

    int insert(PoiInfoMain poiInfoMain);

    int insertSelective(PoiInfoMain poiInfoMain);

    PoiInfoMain selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PoiInfoMain poiInfoMain);

    int updateByPrimaryKey(PoiInfoMain poiInfoMain);
}