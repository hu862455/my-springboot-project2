package com.iflytek.epdcloud.mapper;

import com.iflytek.epdcloud.dto.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2019/02/12
*/
@Mapper
public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser findByUserName(String username);

}