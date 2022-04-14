package com.project.mars.service;

import com.project.mars.vo.Result;
import org.springframework.stereotype.Service;

public interface UserService {
    Result addUser(String username, String password);
    Result login(String username, String password);
}
