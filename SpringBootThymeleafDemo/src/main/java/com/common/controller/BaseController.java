package com.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.common.form.BaseForm;
import org.springframework.ui.Model;


/**
 * @author Sophiee
 * 控制层基类
 */
public abstract class BaseController {

	protected String excute(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form,
			String mappingPath) throws Exception {
		String mode = request.getParameter("mode");
		doInitianize(request, response, model, form);
		switch (mode.toLowerCase()) {
		case "init":
			return doInit(request, response, model, form);
		case "login":
			return doLogin(request, response, model, form);
		case "search":
			return doSearch(request, response, model, form);
		case "next":
			return doNext(request, response, model, form);
		case "return":
			return doReturn(request, response, model, form);
		case "check":
			return doCheck(request, response, model, form);
		default:
			throw new Exception("Error Mode!");
		}
	}

	protected String doLogin(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form) {
		return null;
	};

	protected void doInitianize(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form) {
	}

	protected String doInit(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form) {
		return null;
	}

	protected String doSearch(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form) {
		return null;
	}

	protected String doNext(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form) {
		return null;
	}

	protected String doReturn(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form) {
		return null;
	}

	protected String doCheck(HttpServletRequest request, HttpServletResponse response, Model model, BaseForm form) {
		return null;
	}

	protected void Title(Model model, String title) {
		model.addAttribute("title", title);
	}
}
