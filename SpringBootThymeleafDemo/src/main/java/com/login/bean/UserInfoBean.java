package com.login.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Sophiee
 * @description 用户信息
 */
@Getter
@Setter
public class UserInfoBean {
	private String userId;
	private String password;
	private String userName;
	private String age;
	private String email;
	private String telNo;
	private String address;
	private String deleteFlg;
}
