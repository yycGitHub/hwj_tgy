package com.hwj.tgy.mapper;

import com.hwj.tgy.entity.FinanceLedgerMain;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceLedgerMainMapper {
    int insert(FinanceLedgerMain record);

    int insertSelective(FinanceLedgerMain record);

    FinanceLedgerMain selectByPrimary(String id);

    int updateByPrimaryKeySelective(FinanceLedgerMain record);

    int updateByPrimaryKey(FinanceLedgerMain record);
}