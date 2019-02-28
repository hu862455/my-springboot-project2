package com.iflytek.epdcloud.service;

import com.iflytek.epdcloud.dto.WsConsumption;
import com.iflytek.epdcloud.mapper.WsConsumptionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WsConsumptionService{

    @Resource
    private WsConsumptionMapper wsConsumptionMapper;

    public int deleteByPrimaryKey(Long id){
        return wsConsumptionMapper.deleteByPrimaryKey(id);
    }

    public int insert(WsConsumption record){
        return wsConsumptionMapper.insert(record);
    }

    public int insertSelective(WsConsumption record){
        return wsConsumptionMapper.insertSelective(record);
    }

    public WsConsumption selectByPrimaryKey(Long id){
        return wsConsumptionMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(WsConsumption record){
        return wsConsumptionMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WsConsumption record){
        return wsConsumptionMapper.updateByPrimaryKey(record);
    }

}
