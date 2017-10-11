package com.mydomain.springinside.web.controller;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mydomain.springinside.biz.UserManager;
import com.mydomain.springinside.model.UserVO;

/**
 * Index
 *
 * @author jyl25609
 * @version Id: IndexController, v 0.1 2017/10/11 19:28 jyl25609 Exp $
 */
@Controller
public class IndexController implements BeanFactoryAware {

    @Resource
    private UserManager userManager;

    private BeanFactory beanFactory;

    /**
     * index page
     *
     * @return index
     */
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<h1>Welcome to Index page !</h1>";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user(String account) {
        UserVO userVO = userManager.getUser(account);
        return userVO == null ? "no such user" : userVO.toString();
    }

    @RequestMapping("/bf")
    @ResponseBody
    public String bf() {
        String className = beanFactory.getClass().getName();
        return className;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}