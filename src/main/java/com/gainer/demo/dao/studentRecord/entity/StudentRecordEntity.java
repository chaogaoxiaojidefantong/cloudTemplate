package com.gainer.demo.dao.studentRecord.entity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-10-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("student_record")
@ApiModel(value="StudentRecordEntity对象", description="")
public class StudentRecordEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "主键")
    @TableField("id")
    private Integer id;

    @ApiModelProperty(value = "性别，0为男，1为女")
    @TableField("sex")
    private Boolean sex;

    @ApiModelProperty(value = "证件类型表id")
    @TableField("card_type_id")
    private Integer cardTypeId;

    @ApiModelProperty(value = "证件号码")
    @TableField("idcard")
    private String idcard;

    @ApiModelProperty(value = "出生日期")
    @TableField(value = "birthdate",fill = FieldFill.INSERT)
    private Date birthdate;

    @ApiModelProperty(value = "民族表id")
    @TableField("nation_id")
    private Integer nationId;

    @ApiModelProperty(value = "政治面貌表id")
    @TableField("politics_id")
    private Integer politicsId;

    @ApiModelProperty(value = "籍贯的省份id")
    @TableField("native_province_id")
    private Integer nativeProvinceId;

    @ApiModelProperty(value = "籍贯的市id")
    @TableField("native_city_id")
    private Integer nativeCityId;

    @ApiModelProperty(value = "报考地区的省份id")
    @TableField("examination_province_id")
    private Integer examinationProvinceId;

    @ApiModelProperty(value = "报考地区的市id")
    @TableField("examination_city_id")
    private Integer examinationCityId;

    @TableField("is_delete")
    private Boolean isDelete;

    @ApiModelProperty(value = "联系电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "联系地址")
    @TableField("address")
    private String address;

    @ApiModelProperty(value = "入学年份")
    @TableField("in_year")
    private String inYear;

    @ApiModelProperty(value = "校区id")
    @TableField("campus_area_id")
    private Integer campusAreaId;

    @ApiModelProperty(value = "院系id")
    @TableField("academy_id")
    private Integer academyId;

    @ApiModelProperty(value = "专业id")
    @TableField("major_id")
    private Integer majorId;

    @ApiModelProperty(value = "班级id")
    @TableField("class_id")
    private Integer classId;

    @ApiModelProperty(value = "入学日期")
    @TableField("attend_date")
    private Date attendDate;

    @ApiModelProperty(value = "学号")
    @TableField("student_number")
    private Integer studentNumber;

    @ApiModelProperty(value = "学籍状态")
    @TableField("student_status")
    private Integer studentStatus;

    @ApiModelProperty(value = "正面免冠照二进制")
    @TableField("photo")
    private String photo;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "是否启用 1：启用，0：禁用")
    @TableField("status")
    private Boolean status;

}
