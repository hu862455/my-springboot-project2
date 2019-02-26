package com.iflytek.epdcloud.api.user;

import com.alibaba.fastjson.JSONObject;
import com.iflytek.epdcloud.service.SysUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
public class UserApi {

    @Autowired
    SysUserService userService;

    @RequestMapping(value = "/getAllUser")
    public JSONObject geyAllUser(){
        return null;
    }
}
