package com.iflytek.epdcloud.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.iflytek.epdcloud.dto.SysRoleUser;
import com.iflytek.epdcloud.mapper.SysRoleUserMapper;

@Service
public class SysRoleUserService{

    @Resource
    private SysRoleUserMapper sysRoleUserMapper;

    public int deleteByPrimaryKey(Integer id){
        return sysRoleUserMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysRoleUser record){
        return sysRoleUserMapper.insert(record);
    }

    public int insertSelective(SysRoleUser record){
        return sysRoleUserMapper.insertSelective(record);
    }

    public SysRoleUser selectByPrimaryKey(Integer id){
        return sysRoleUserMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysRoleUser record){
        return sysRoleUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysRoleUser record){
        return sysRoleUserMapper.updateByPrimaryKey(record);
    }

}
