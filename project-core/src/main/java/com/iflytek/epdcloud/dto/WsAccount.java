package com.iflytek.epdcloud.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * Created by Mybatis Generator 2019/03/01
 */
@ApiModel(value = "com.iflytek.epdcloud.dto.WsAccount")
@Data
public class WsAccount implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Long id;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Long userId;

    /**
     * 账户余额
     */
    @ApiModelProperty(value = "账户余额")
    private BigDecimal curMoney;

    private static final long serialVersionUID = 1L;

    public WsAccount() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.iflytek.epdcloud.dto.WsAccount;
    }
}