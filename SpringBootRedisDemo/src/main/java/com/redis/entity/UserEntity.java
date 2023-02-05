package com.redis.entity;

import com.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName: UserEntity
 * @Auther: csy
 * @Description: 用户信息
 */
@Entity
@Table(name = "user")
@Data
public class UserEntity extends BaseEntity {
    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "age")
    private int age;
}
