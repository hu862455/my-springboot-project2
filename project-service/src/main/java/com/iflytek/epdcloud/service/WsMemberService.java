package com.iflytek.epdcloud.service;

import com.iflytek.epdcloud.dto.WsMember;
import com.iflytek.epdcloud.mapper.WsMemberMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WsMemberService{

    @Resource
    private WsMemberMapper wsMemberMapper;

    public int deleteByPrimaryKey(Long id){
        return wsMemberMapper.deleteByPrimaryKey(id);
    }

    public int insert(WsMember record){
        return wsMemberMapper.insert(record);
    }

    public int insertSelective(WsMember record){
        return wsMemberMapper.insertSelective(record);
    }

    public WsMember selectByPrimaryKey(Long id){
        return wsMemberMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(WsMember record){
        return wsMemberMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WsMember record){
        return wsMemberMapper.updateByPrimaryKey(record);
    }

}
