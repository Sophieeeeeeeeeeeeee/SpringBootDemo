package com.login.service.impl;

import com.login.bean.UserInfoBean;
import com.login.data.LoginData;
import com.login.repository.LoginMapper;
import com.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Sophiee
 * 登录用Service实现类
 */
@Service
@Component
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginMapper loginMapper;

	/**
	 * @param loginData 获取用户信息的条件对象
	 * @return  UserInfoBean 用户信息
	 * @description 获取用户信息
	 */
	@Override
	public UserInfoBean getUserInfo(LoginData loginData) {
		return loginMapper.getUserInfo(loginData);
	}
}