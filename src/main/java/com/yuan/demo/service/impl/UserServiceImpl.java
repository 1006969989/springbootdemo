package com.yuan.demo.service.impl;

import com.yuan.demo.entity.User;
import com.yuan.demo.mapper.UserMapper;
import com.yuan.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(String id) {
        User user = userMapper.selectById(id);
        log.info("user===="+user);
        User user1 = userMapper.queryByIdUser(id);
        log.info("user1===="+user1);
        return user;
    }
}
