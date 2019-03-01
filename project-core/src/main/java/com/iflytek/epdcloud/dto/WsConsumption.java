package com.iflytek.epdcloud.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by Mybatis Generator 2019/02/28
 */
@ApiModel(value = "com.iflytek.epdcloud.dto.WsConsumption")
@Data
public class WsConsumption implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Long id;

    /**
     * 消费日期
     */
    @ApiModelProperty(value = "消费日期")
    private Date date;

    /**
     * 用户id
     */
    @NotNull(message = "用户id不能为空！")
    @ApiModelProperty(value = "用户id")
    private Long userId;

    /**
     * 消费金额
     */
    @ApiModelProperty(value = "消费金额")
    private BigDecimal cost;

    /**
     * 充值金额
     */
    @ApiModelProperty(value = "充值金额")
    private BigDecimal recharge;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String msg;

    private static final long serialVersionUID = 1L;

    public WsConsumption() {
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.iflytek.epdcloud.dto.WsConsumption)) return false;
        final com.iflytek.epdcloud.dto.WsConsumption other = (com.iflytek.epdcloud.dto.WsConsumption) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$date = this.getDate();
        final Object other$date = other.getDate();
        if (this$date == null ? other$date != null : !this$date.equals(other$date)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$cost = this.getCost();
        final Object other$cost = other.getCost();
        if (this$cost == null ? other$cost != null : !this$cost.equals(other$cost)) return false;
        final Object this$recharge = this.getRecharge();
        final Object other$recharge = other.getRecharge();
        if (this$recharge == null ? other$recharge != null : !this$recharge.equals(other$recharge)) return false;
        return true;
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.iflytek.epdcloud.dto.WsConsumption;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $date = this.getDate();
        result = result * PRIME + ($date == null ? 43 : $date.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $cost = this.getCost();
        result = result * PRIME + ($cost == null ? 43 : $cost.hashCode());
        final Object $recharge = this.getRecharge();
        result = result * PRIME + ($recharge == null ? 43 : $recharge.hashCode());
        return result;
    }

    public String toString() {
        return "WsConsumption(id=" + this.getId() + ", date=" + this.getDate() + ", userId=" + this.getUserId() + ", cost=" + this.getCost() + ", recharge=" + this.getRecharge() + ")";
    }
}