package com.redis.service.impl;

import com.redis.dao.UserDao;
import com.redis.entity.UserEntity;
import com.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Auther: csy
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public UserEntity save(UserEntity user) {
        return null;
    }

    @Override
    public UserEntity findById(String id) {
        return userDao.findById(id);
    }

    @Override
    public void delete(UserEntity user) {
        userDao.delete(user);
    }

    @Override
    public List<UserEntity> findAll() {
        return userDao.findAll();
    }
}
