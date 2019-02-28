package com.iflytek.epdcloud.mapper;

import com.iflytek.epdcloud.dto.WsMember;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2019/02/28
*/
@Mapper
public interface WsMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WsMember record);

    int insertSelective(WsMember record);

    WsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WsMember record);

    int updateByPrimaryKey(WsMember record);
}