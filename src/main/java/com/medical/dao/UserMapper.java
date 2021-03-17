package com.medical.dao;

import com.medical.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User record);

    int update(User record);

    List<User> getUserById(String uid);

}
