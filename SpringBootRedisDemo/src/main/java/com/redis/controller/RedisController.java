package com.redis.controller;

import com.common.controller.BaseController;
import com.common.utils.ConvertUtils;
import com.common.utils.RedisConstants;
import com.common.utils.RedisUtil;
import com.common.utils.ResultConstants;
import com.redis.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Auther: csy
 * @Description: redis呼出控制类
 */
@Controller
public class RedisController extends BaseController {

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    ConvertUtils convertUtils;

    /**
     * @auther: csy
     * @param: []
     * @return: 画面相对Path
     * @Description: 存储和读取测试
     */
    @RequestMapping(value="/list")
    public String view(HttpServletRequest request, String name){
        logger.info("返回列表页面");
        return "/demoPage/listPage/"+ name;
    }

    /**
     * @auther: csy
     * @param: []
     * @return: org.springframework.ui.ModelMap
     * @Description: 存储和读取测试
     */
    @RequestMapping(value="/test")
    @ResponseBody
    public ModelMap test(){
        try {
            redisUtil.set("redisTemplate","这是一条测试数据", RedisConstants.DATEBASE2);
            String value = redisUtil.get("redisTemplate",RedisConstants.DATEBASE2).toString();
            logger.info("redisValue="+value);
            logger.info("读取redis成功");
            return getModelMap(ResultConstants.SUCCESS, value, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return getModelMap(ResultConstants.FAULT, null, "操作失败");
        }
    }

    /**
     * @auther: csy
     * @return: org.springframework.ui.ModelMap
     * @Description: 存储和读取用户信息
     */
    @RequestMapping(value="/setuser")
    @ResponseBody
    public ModelMap setUser(){
        try {
            UserEntity user = new UserEntity();
            user.setName("csy");
            user.setAge(28);
            user.setId(getUuid());
            redisUtil.hmset("user",convertUtils.objectToMap(user));
            Map<Object, Object> res = redisUtil.hmget("user");
            logger.info("res="+res.toString());
            logger.info("读取redis成功");
            return getModelMap(ResultConstants.SUCCESS, convertUtils.mapToObject(res,new UserEntity().getClass()), "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return getModelMap(ResultConstants.FAULT, null, "操作失败");
        }
    }
}
