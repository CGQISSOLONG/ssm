package com.ssm.services;

import com.ssm.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User getUser(int id);
}
