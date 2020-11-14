package com.gainer.demo.dao.district.param;
import com.gainer.demo.params.BaseQueryParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Api("省市区查询参数")
public class DistrictQueryParam extends BaseQueryParam {
    @NotNull(message = "省份编号不能为空")
    @ApiModelProperty(value = "省份编号",required = false)
    private String provinceCode;
    @ApiModelProperty(value = "城市编号",required = false)
    private String cityCode;
    @ApiModelProperty(value = "地区编号",required = false)
    private String areaCode;
}
