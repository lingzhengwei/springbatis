package com.ext.springbatis.controller;

import com.ext.springbatis.model.User;
import com.ext.springbatis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @PostMapping(value = "/addUser", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user) {
        logger.info("用户" + user.toString());
        return userService.addUser(user);
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum,
            @PathVariable("pageSize") int pageSize) {
        return userService.findAllUser(pageNum, pageSize);
    }
}
