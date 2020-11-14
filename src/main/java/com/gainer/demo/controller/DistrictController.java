package com.gainer.demo.controller;
import com.gainer.demo.dao.district.entity.DistrictEntity;
import com.gainer.demo.dao.district.param.DistrictQueryParam;
import com.gainer.demo.service.district.IDistrictService;
import com.hjkj.campus.util.response.ResponseUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/district")
@Api(tags = "省市区接口")
public class DistrictController {
    @Autowired
    IDistrictService districtService;
    @GetMapping("districtEntity")
    @ApiOperation("查询省市区")
    public ResponseUtils<DistrictEntity>selectEntity(@Validated DistrictQueryParam districtQueryParam){
        return  districtService.selectEntity(districtQueryParam);
    }
}
