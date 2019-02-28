package com.iflytek.epdcloud.mapper;

import com.iflytek.epdcloud.dto.WsAccount;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2019/02/28
*/
@Mapper
public interface WsAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WsAccount record);

    int insertSelective(WsAccount record);

    WsAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WsAccount record);

    int updateByPrimaryKey(WsAccount record);
}