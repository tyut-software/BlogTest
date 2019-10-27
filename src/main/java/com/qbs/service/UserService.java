package com.qbs.service;

import com.qbs.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
