package com.iflytek.epdcloud.service;

import com.iflytek.epdcloud.dto.WsConsumption;
import com.iflytek.epdcloud.dto.WsUser;
import com.iflytek.epdcloud.mapper.WsAccountMapper;
import com.iflytek.epdcloud.mapper.WsUserMapper;
import com.iflytek.epdcloud.vo.ResultVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WsUserService{

    @Resource
    private WsUserMapper wsUserMapper;

    @Resource
    private WsAccountMapper wsAccountMapper;

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

    public ResultVo recharge(WsConsumption consumption){
        // 1.修改用户账号余额
        wsAccountMapper.updateByPrimaryKeySelective()
        // 2.添加消费/充值记录
    }

}
