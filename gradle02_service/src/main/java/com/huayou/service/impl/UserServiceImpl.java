package com.huayou.service.impl;

import com.huayou.dao.UserDao;
import com.huayou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public String toList() {
        return userDao.toList();
    }
}
