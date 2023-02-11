package com.login.form;

import com.common.form.BaseForm;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Sophiee
 * @description 登录画面表单信息
 */
@Getter
@Setter
public class LoginForm extends BaseForm {
	private String userId;
	private String password;
}
