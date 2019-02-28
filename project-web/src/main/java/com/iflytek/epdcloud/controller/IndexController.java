package com.iflytek.epdcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Package_name: com.iflytek.epdcloud.controller
 * @Class_name: $CLASS_NAME$
 * @Exception: $Exception$
 * @Describe: TODO
 * @Author: shuaihu2
 * @Creat_date: 2019 2019/2/28 11:16
 **/
@Controller
@RequestMapping(value = "index" ,method = RequestMethod.GET)
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
