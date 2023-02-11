package com.redis.dao;

import com.redis.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Sophiee
 * @Description: dao层接口
 */
@Transactional
public interface UserDao extends PagingAndSortingRepository<UserEntity, Long>,JpaSpecificationExecutor<UserEntity>,JpaRepository<UserEntity,Long> {
    UserEntity findById(String id);
}
