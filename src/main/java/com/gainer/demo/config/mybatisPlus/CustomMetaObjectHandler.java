package com.gainer.demo.config.mybatisPlus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 注入到 mybatis 底层的参数处理类，处理公共字段
 *
 * @see com.baomidou.mybatisplus.core.MybatisDefaultParameterHandler
 */
@Slf4j
@Component
public class CustomMetaObjectHandler implements MetaObjectHandler {

    private static final String FIELD_LOGIC_DELETE = "isDelete";

    private static final String FIELD_CREATED_TIME = "createTime";

    private static final String FIELD_UPDATED_TIME = "updateTime";

    private static final String FIELD_STATUS = "status";

    @Override
    public void insertFill(MetaObject metaObject) {
        // 添加处理之后，不需要每次新增都手动设置该字段了
        this.strictInsertFill(metaObject, FIELD_STATUS, Integer.class, 1);
        this.strictInsertFill(metaObject, FIELD_LOGIC_DELETE, Integer.class, 0);
        this.strictInsertFill(metaObject, FIELD_CREATED_TIME, Date.class, new Date());
        this.strictInsertFill(metaObject, FIELD_UPDATED_TIME, Date.class, new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 添加处理之后，不需要每次更新都手动设置该字段了
        // 使用 setFieldValByName 强制设置，因为可能页面把旧值传进来了
        this.setFieldValByName(FIELD_UPDATED_TIME, new Date(), metaObject);
    }
}
