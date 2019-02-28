package com.iflytek.epdcloud.mapper;

import com.iflytek.epdcloud.dto.WsUser;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2019/02/28
*/
@Mapper
public interface WsUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(WsUser record);

    int insertSelective(WsUser record);

    WsUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WsUser record);

    int updateByPrimaryKey(WsUser record);

    WsUser selectByParam(WsUser record);
}