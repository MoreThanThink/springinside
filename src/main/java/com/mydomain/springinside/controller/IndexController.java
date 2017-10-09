package com.mydomain.springinside.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * index controller
 * 
 * @author jyl25609
 * @version Id: IndexController, v 0.1 2017-10-09 14:04:10 jyl25609 Exp $
 */
@Controller
public class IndexController {
    /**
     * index
     * 
     * @return
     */
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "welcome to index page !";
    }
}
