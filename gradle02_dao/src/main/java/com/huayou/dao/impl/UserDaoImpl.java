package com.huayou.dao.impl;

import com.huayou.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public String toList() {
        return "保存成功！";
    }
}
