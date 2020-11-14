package com.gainer.demo.controller;
import com.gainer.demo.dao.studentRecord.entity.StudentRecordEntity;
import com.gainer.demo.dao.studentRecord.param.StudentRecordQueryParam;
import com.gainer.demo.service.studentRecord.IStudentRecordService;
import com.hjkj.campus.util.response.ResponseUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/studentRecord")
public class StudentRecordController {

    @Autowired
    IStudentRecordService studentRecordService;

    @GetMapping("studentRecordCrud")
    @ApiOperation(value = "获取档案")
    public ResponseUtils<StudentRecordEntity> getStudentRecord(StudentRecordQueryParam studentRecordQueryParam){
       return studentRecordService.getStudentRecord(studentRecordQueryParam);
    }
}
