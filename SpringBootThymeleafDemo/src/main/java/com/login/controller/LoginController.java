package com.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.controller.BaseLoginController;
import com.common.form.BaseForm;
import com.login.data.LoginData;
import com.login.form.LoginForm;
import com.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Sophiee
 * 登录处理控制类
 */
@Controller
public class LoginController extends BaseLoginController {
	private static final String CONST_MAPPING_PATH = "/login";

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = { CONST_MAPPING_PATH }, method = { RequestMethod.GET, RequestMethod.POST })
	public String doExecute(HttpServletRequest request, HttpServletResponse response, Model model, LoginForm form)
			throws Exception {
		return super.excute(request, response, model, form, CONST_MAPPING_PATH);
	}

	@Override
	public void doInitianize(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form) {
		super.Title(model, "Login");
	}

	@Override
	public String doInit(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form) {
		LoginForm loginForm = (LoginForm) form;
		model.addAttribute("loginForm", loginForm);
		return "/login/login";
	}

	@Override
	public String doLogin(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form) {
		LoginForm loginForm = (LoginForm) form;
		String userId = loginForm.getUserId();
		LoginData loginData = new LoginData();
		loginData.setUserId(userId);
		loginService.getUserInfo(loginData);
		model.addAttribute("title","Welcome!");
		return "/login/menu";
	}
}
