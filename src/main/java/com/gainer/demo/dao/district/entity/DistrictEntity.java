package com.gainer.demo.dao.district.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Api("省市区返回实体")
public class DistrictEntity {
    @ApiModelProperty(value = "省份名字")
    private String provinceName;
    @ApiModelProperty(value = "城市名字")
    private String cityName;
    @ApiModelProperty(value = "地区名字")
    private String areaName;
    @ApiModelProperty(value = "省份编号")
    private String provinceCode;
    @ApiModelProperty(value = "城市编号")
    private String cityCode;
    @ApiModelProperty(value = "地区编号")
    private String areaCode;
}
