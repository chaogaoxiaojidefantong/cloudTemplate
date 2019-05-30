package com.lcw.adminService.dao;

import com.lcw.common.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {
public Integer updateUser(User user);
public Integer updateUserByCode(User user);
}
