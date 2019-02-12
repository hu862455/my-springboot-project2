package com.iflytek.epdcloud.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/12
*/
@ApiModel(value="com.iflytek.epdcloud.dto.SysRole")
@Data
public class SysRole implements Serializable {
    /**
	* 主键
	*/
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
	* 角色名
	*/
    @ApiModelProperty(value="角色名")
    private String name;

    private static final long serialVersionUID = 1L;
}