package com.iflytek.epdcloud.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.iflytek.epdcloud.mapper.SysUserMapper;
import com.iflytek.epdcloud.dto.SysUser;

@Service
public class SysUserService{

    @Resource
    private SysUserMapper sysUserMapper;

    public int deleteByPrimaryKey(Integer id){
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysUser record){
        return sysUserMapper.insert(record);
    }

    public int insertSelective(SysUser record){
        return sysUserMapper.insertSelective(record);
    }

    public SysUser selectByPrimaryKey(Integer id){
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysUser record){
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysUser record){
        return sysUserMapper.updateByPrimaryKey(record);
    }

}
