package com.ing.pensions.repository.database;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ing.pensions.bean.database.remittance.RemittanceBean;

/**
 * Oracle/H2 database Mapper for remittances.
 *
 * @author alejandro guede
 *
 */
@Mapper
public interface IRemittanceMapper {

    @Insert("INSERT INTO REMITTANCES (REMITTANCE_MESSAGE) VALUES (#{messageId})")
    @Options(useGeneratedKeys = true, keyProperty = "messageId", keyColumn = "REMITTANCE_MESSAGE")
    void insertRemittance(RemittanceBean remittanceBean);

    @Select("SELECT * FROM REMITTANCES")
    @Results(value = { @Result(property = "remittanceId", column = "REMITTANCE_ID"),
                       @Result(property = "messageId", column = "REMITTANCE_MESSAGE") })
    List<RemittanceBean> selectRemittances();
}
