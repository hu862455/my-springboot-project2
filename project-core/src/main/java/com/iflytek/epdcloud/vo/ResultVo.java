package com.iflytek.epdcloud.vo;


import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVo implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * code码 0正常 1异常
     */
    private Integer code;

    /**
     * 错误/操作信息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;


}
