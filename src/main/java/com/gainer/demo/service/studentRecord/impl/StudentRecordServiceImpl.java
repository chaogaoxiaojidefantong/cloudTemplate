package com.gainer.demo.service.studentRecord.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gainer.demo.config.aop.SysLog;
import com.gainer.demo.dao.studentRecord.entity.StudentRecordEntity;
import com.gainer.demo.dao.studentRecord.mapper.StudentRecordMapper;
import com.gainer.demo.dao.studentRecord.param.StudentRecordQueryParam;
import com.gainer.demo.service.studentRecord.IStudentRecordService;
import com.hjkj.campus.util.response.ResponseUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-10-22
 */
@Service
public class StudentRecordServiceImpl extends ServiceImpl<StudentRecordMapper, StudentRecordEntity> implements IStudentRecordService {
    @SysLog
    public ResponseUtils<StudentRecordEntity> getStudentRecord(StudentRecordQueryParam studentRecordQueryParam){
        StudentRecordEntity res=this.getById(1);
        return ResponseUtils.success(res);
    }
}
