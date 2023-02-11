package com.login.service;

import com.login.bean.UserInfoBean;
import com.login.data.LoginData;
import org.springframework.stereotype.Service;

/**
 * @author Sophiee
 * 登录用Service
 */
@Service
public interface LoginService {

	/**
	 * @param loginData 获取用户信息的条件对象
	 * @return  UserInfoBean 用户信息
	 * @description 获取用户信息
	 */
	UserInfoBean getUserInfo(LoginData loginData);
}