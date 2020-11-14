package com.gainer.demo.service.district.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gainer.demo.dao.district.entity.DistrictEntity;
import com.gainer.demo.dao.district.mapper.DistrictMapper;
import com.gainer.demo.dao.district.param.DistrictQueryParam;
import com.gainer.demo.service.district.IDistrictService;
import com.hjkj.campus.util.response.ResponseUtils;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl extends ServiceImpl<DistrictMapper, DistrictEntity> implements IDistrictService {
    public ResponseUtils selectEntity(DistrictQueryParam districtQueryParam){
       DistrictEntity districtEntity=this.baseMapper.selectEntity(districtQueryParam);
       return ResponseUtils.success(districtEntity);
    }
}
