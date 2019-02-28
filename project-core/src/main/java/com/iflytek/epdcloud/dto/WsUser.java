package com.iflytek.epdcloud.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
* Created by Mybatis Generator 2019/02/28
*/
@ApiModel(value="com.iflytek.epdcloud.dto.WsUser")
@Data
public class WsUser implements Serializable {
    /**
	* 用户id
	*/
    @ApiModelProperty(value="用户id")
    private Long id;

    /**
	* 用户名
	*/
    @NotNull(message = "用户名不能为空")
    @ApiModelProperty(value="用户名")
    private String username;

    /**
	* 手机号码
	*/
    @NotNull(message = "手机号码不能为空")
    @ApiModelProperty(value="手机号码")
    private String phone;

    /**
	* 地址
	*/
    @ApiModelProperty(value="地址")
    private String address;

    /**
	* 会员级别（0 普通会员，1 一级会员，2 二级会员 ...)
	*/
    @NotNull(message = "会员等级不能为空")
    @ApiModelProperty(value="会员级别（0 普通会员，1 一级会员，2 二级会员 ...)")
    private Integer memberLeve;

    /**
	* 是否为管理员（0不是，1是）
	*/
    @ApiModelProperty(value="是否为管理员（0不是，1是）")
    private Integer ismanage;

    /**
	* 删除标志（0未删除，1已删除）
	*/
    @ApiModelProperty(value="删除标志（0未删除，1已删除）")
    private Integer delFlag;

    private static final long serialVersionUID = 1L;
}