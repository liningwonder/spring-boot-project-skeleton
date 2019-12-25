package com.datafusion.iam.service.impl;

import com.datafusion.iam.service.UserService;
import com.datafusion.iam.sql.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id).getName();
    }
}
