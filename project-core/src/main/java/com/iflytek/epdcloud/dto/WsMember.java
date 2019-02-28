package com.iflytek.epdcloud.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/28
*/
@ApiModel(value="com.iflytek.epdcloud.dto.WsMember")
@Data
public class WsMember implements Serializable {
    /**
	* 主键
	*/
    @ApiModelProperty(value="主键")
    private Long id;

    /**
	* 会员级别
	*/
    @ApiModelProperty(value="会员级别")
    private Integer memberLeve;

    /**
	* 会员折扣（小数）
	*/
    @ApiModelProperty(value="会员折扣（小数）")
    private Double discount;

    private static final long serialVersionUID = 1L;
}