package com.siddhantbhardwaj.user_service.controller;

import com.siddhantbhardwaj.user_service.VO.ResponseTemplateVO;
import com.siddhantbhardwaj.user_service.entity.User;
import com.siddhantbhardwaj.user_service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of controller");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment of controller");
        return userService.getUserWithDepartment(userId);
    }


}
