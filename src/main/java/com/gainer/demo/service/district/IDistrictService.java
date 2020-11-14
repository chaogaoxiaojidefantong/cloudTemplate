package com.gainer.demo.service.district;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gainer.demo.dao.district.entity.DistrictEntity;
import com.gainer.demo.dao.district.param.DistrictQueryParam;
import com.hjkj.campus.util.response.ResponseUtils;

public interface IDistrictService extends IService<DistrictEntity> {
    ResponseUtils selectEntity(DistrictQueryParam districtQueryParam);
}
