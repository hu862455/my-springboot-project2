package com.iflytek.epdcloud.mapper;

import com.iflytek.epdcloud.dto.WsConsumption;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Mybatis Generator 2019/02/28
 */
@Mapper
public interface WsConsumptionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WsConsumption record);

    int insertSelective(WsConsumption record);

    WsConsumption selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WsConsumption record);

    int updateByPrimaryKey(WsConsumption record);
}