package com.iflytek.epdcloud.service;

import com.iflytek.epdcloud.dto.WsUser;
import com.iflytek.epdcloud.mapper.WsUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WsUserService{

    @Resource
    private WsUserMapper wsUserMapper;

    public int deleteByPrimaryKey(Long id){
        return wsUserMapper.deleteByPrimaryKey(id);
    }

    public int insert(WsUser record){

        return wsUserMapper.insert(record);
    }

    public int insertSelective(WsUser record){
        return wsUserMapper.insertSelective(record);
    }

    public WsUser selectByPrimaryKey(Long id){
        return wsUserMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(WsUser record){
        return wsUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WsUser record){
        return wsUserMapper.updateByPrimaryKey(record);
    }

    public WsUser selectByParam(WsUser record){
        return wsUserMapper.selectByParam(record);
    }

}
