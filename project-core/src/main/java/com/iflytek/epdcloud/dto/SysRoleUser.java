package com.iflytek.epdcloud.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/12
*/
@ApiModel(value="com.iflytek.epdcloud.dto.SysRoleUser")
@Data
public class SysRoleUser implements Serializable {
    /**
	* 主键
	*/
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
	* 用户id
	*/
    @ApiModelProperty(value="用户id")
    private Integer sysUserId;

    /**
	* 角色id
	*/
    @ApiModelProperty(value="角色id")
    private Integer sysRoleId;

    private static final long serialVersionUID = 1L;
}