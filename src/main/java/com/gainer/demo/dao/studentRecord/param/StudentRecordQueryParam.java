package com.gainer.demo.dao.studentRecord.param;

import com.gainer.demo.params.BaseQueryParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "档案查询接口")
@Data
public class StudentRecordQueryParam extends BaseQueryParam {
    @ApiModelProperty(value = "学生档案id")
    private Integer id;
}
