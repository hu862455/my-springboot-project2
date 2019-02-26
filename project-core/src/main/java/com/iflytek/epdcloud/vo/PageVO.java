package com.iflytek.epdcloud.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@ApiModel(value="com.iflytek.epdcloud.vo.PageVO")
@Data
public class PageVO<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="总共多少页")
    private Integer count;
    @ApiModelProperty(value="一页最大条数")
    private Integer pageSize;
    @ApiModelProperty(value="当前页码")
    private Integer page;
    @ApiModelProperty(value="是否有下一页")
    private Integer isMore;
    @ApiModelProperty(value="数据")
    private List<T> data;

    public PageVO() {
    }
    public PageVO(Integer count, Integer pageSize, Integer page) {
        this.count = count;
        this.pageSize = pageSize;
        this.page = page;
    }
}
