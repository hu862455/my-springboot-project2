package com.iflytek.epdcloud.service;

import com.iflytek.epdcloud.dto.WsAccount;
import com.iflytek.epdcloud.mapper.WsAccountMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WsAccountService{

    @Resource
    private WsAccountMapper wsAccountMapper;

    public int deleteByPrimaryKey(Long id){
        return wsAccountMapper.deleteByPrimaryKey(id);
    }

    public int insert(WsAccount record){
        return wsAccountMapper.insert(record);
    }

    public int insertSelective(WsAccount record){
        return wsAccountMapper.insertSelective(record);
    }

    public WsAccount selectByPrimaryKey(Long id){
        return wsAccountMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(WsAccount record){
        return wsAccountMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WsAccount record){
        return wsAccountMapper.updateByPrimaryKey(record);
    }

}
