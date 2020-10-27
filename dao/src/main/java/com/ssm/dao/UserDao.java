package com.ssm.dao;

import com.ssm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> findAll();

}
