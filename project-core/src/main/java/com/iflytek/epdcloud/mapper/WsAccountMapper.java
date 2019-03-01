package com.iflytek.epdcloud.mapper;

import com.iflytek.epdcloud.dto.WsAccount;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Mybatis Generator 2019/03/01
 */
@Mapper
public interface WsAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WsAccount record);

    int insertSelective(WsAccount record);

    WsAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WsAccount record);

    int updateByPrimaryKey(WsAccount record);

    int updateBatch(List<WsAccount> list);

    int batchInsert(@Param("list") List<WsAccount> list);

    int updateCurMoneyByUserId(Long userId);
}