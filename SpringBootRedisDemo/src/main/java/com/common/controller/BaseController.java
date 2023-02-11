package com.common.controller;

import com.common.utils.ResultConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;

import java.util.UUID;

/**
 * @author Sophiee
 * @ClassName: BaseController
 * @Description: 底层控制类
 */
public abstract class BaseController{

	protected final String success = ResultConstants.SUCCESS;
	protected final String  fail = ResultConstants.FAULT;
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * @Description: 处理Model
	 */
	public ModelMap getModelMap(String status,Object data,String msg){
		ModelMap modelMap=new ModelMap();
		modelMap.put("status", status);
		modelMap.put("data", data);
		modelMap.put("msg", msg);
		return modelMap;
	}

	/**
	 * 获取UUID并转化为String对象
	 */
	public String getUuid(){
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-", "");
		return uuid;
	}

}
