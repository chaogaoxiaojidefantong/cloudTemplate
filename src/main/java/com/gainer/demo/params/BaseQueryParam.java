package com.gainer.demo.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "基本参数")
@Data
public class BaseQueryParam implements Serializable {

    @ApiModelProperty(value = "条数")
    private Long pageSize;

    @ApiModelProperty(value = "页码")
    private Long pageNo;

}
