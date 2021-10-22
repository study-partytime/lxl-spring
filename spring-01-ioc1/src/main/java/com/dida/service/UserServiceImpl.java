package com.dida.service;

import com.dida.dao.UserDao;
import com.dida.dao.UserDaoImpl;
import com.dida.dao.UserDaoMysqlImpl;
import com.dida.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    @Override
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
