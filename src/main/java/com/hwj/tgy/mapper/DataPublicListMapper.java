package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.DataPublicList;
import org.springframework.stereotype.Repository;

@Repository
public interface DataPublicListMapper {
    int insert(DataPublicList record);

    int insertSelective(DataPublicList record);

    DataPublicList selectByPrimary(String id);

    int updateByPrimaryKeySelective(DataPublicList record);

    int updateByPrimaryKey(DataPublicList record);
}