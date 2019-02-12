package com.iflytek.epdcloud.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/02/12
*/
@ApiModel(value="com.iflytek.epdcloud.dto.SysUser")
@Data
public class SysUser implements Serializable {
    /**
	* 主键
	*/
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
	* 用户名
	*/
    @ApiModelProperty(value="用户名")
    private String username;

    /**
	* 密码
	*/
    @ApiModelProperty(value="密码")
    private String password;

    private static final long serialVersionUID = 1L;
}