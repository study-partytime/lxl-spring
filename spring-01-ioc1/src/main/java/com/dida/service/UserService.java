package com.dida.service;

import com.dida.dao.UserDao;

public interface UserService {
    void getUser();

    void setUserDao(UserDao userDao);
}
