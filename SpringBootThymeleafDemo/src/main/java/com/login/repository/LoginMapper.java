package com.login.repository;

import com.login.bean.UserInfoBean;
import com.login.data.LoginData;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Sophiee
 * 登录用Mapper
 */
@Mapper
public interface LoginMapper {

	/**
	 * @param loginData 获取用户信息的条件存储对象
	 * @return  UserInfoBean 用户信息
	 * @description � 获取用户信息
	 */
	UserInfoBean getUserInfo(LoginData loginData);
}
