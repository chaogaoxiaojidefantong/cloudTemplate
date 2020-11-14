package com.gainer.demo.service.studentRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gainer.demo.dao.studentRecord.entity.StudentRecordEntity;
import com.gainer.demo.dao.studentRecord.param.StudentRecordQueryParam;
import com.hjkj.campus.util.response.ResponseUtils;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-10-22
 */
public interface IStudentRecordService extends IService<StudentRecordEntity> {
    ResponseUtils<StudentRecordEntity> getStudentRecord(StudentRecordQueryParam studentRecordQueryParam);
}
