package com.project.mars.dao.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    void addUser(@Param("username") String username, @Param("password") String password);
    String findUsername(@Param("username") String username);
    String matchPassword(@Param("username") String username, @Param("password") String password);
}
