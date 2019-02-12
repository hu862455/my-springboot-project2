package com.iflytek.epdcloud.mapper;

import com.iflytek.epdcloud.dto.SysRoleUser;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2019/02/12
*/
@Mapper
public interface SysRoleUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleUser record);

    int updateByPrimaryKey(SysRoleUser record);
}