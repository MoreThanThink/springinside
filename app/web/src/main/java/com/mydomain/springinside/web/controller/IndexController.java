package com.mydomain.springinside.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Index
 *
 * @author jyl25609
 * @version Id: IndexController, v 0.1 2017/10/11 19:28 jyl25609 Exp $
 */
@Controller
public class IndexController {
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
}
