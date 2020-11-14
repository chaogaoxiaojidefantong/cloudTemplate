package com.gainer.demo.dao.district.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gainer.demo.dao.district.entity.DistrictEntity;
import com.gainer.demo.dao.district.param.DistrictQueryParam;
public interface DistrictMapper extends BaseMapper<DistrictEntity> {
    DistrictEntity selectEntity(DistrictQueryParam districtQueryParam);
}
