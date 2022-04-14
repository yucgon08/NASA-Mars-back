package com.project.mars.controller;

import com.project.mars.service.UserService;
import com.project.mars.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", method = RequestMethod.GET)
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    // http://localhost:9000/api/create_user?username=Yucheng&password=123123
    @GetMapping("/create_user")
    public Result add(@RequestParam("username") String username, @RequestParam("password")String password) {
        return userService.addUser(username, password);
    }

    // http://localhost:9000/api/login?username=Yucheng&password=123123
    @GetMapping("/login")
    public Result login(@RequestParam("username") String username, @RequestParam("password")String password) {
        return userService.login(username, password);
    }
}
