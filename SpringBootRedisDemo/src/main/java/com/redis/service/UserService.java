package com.redis.service;


import com.redis.entity.UserEntity;

import java.util.List;


/**
 * @author Sophiee
 * 用户service借口
 */
public interface UserService {
    /**
     * 用户信息保存
     * @param user 用户对象
     * @return UserEntity
     */
    UserEntity save(UserEntity user);

    /**
     * 通过ID查询用户信息
     * @param id ID
     * @return UserEntity
     */
    UserEntity findById(String id);

    /**
     * 删除用户信息
     * @param user 用户对象
     */
    void delete(UserEntity user);

    /**
     * 查询所有用户信息
     * @return UserEntity
     */
    List<UserEntity> findAll();
}
