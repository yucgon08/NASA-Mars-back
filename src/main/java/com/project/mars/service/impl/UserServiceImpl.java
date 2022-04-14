package com.project.mars.service.impl;

import com.project.mars.dao.mappers.UserMapper;
import com.project.mars.service.UserService;
import com.project.mars.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Result addUser(String username, String password) {
        if (userMapper.findUsername(username) != null) {
            return Result.fail(403, "Username has been already existed");
        }
        userMapper.addUser(username, password);
        return Result.success("Add user is successful");
    }

    @Override
    public Result login(String username, String password) {
        if (userMapper.findUsername(username) != null) {
            if (userMapper.matchPassword(username, password) != null) {
                return Result.success("login is successful");
            } else {
                return Result.fail(403, "login is fail");
            }
        } else {
            return Result.fail(403, "login is fail");
        }
    }
}
