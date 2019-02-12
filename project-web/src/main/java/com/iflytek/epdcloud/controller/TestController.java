package com.iflytek.epdcloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.iflytek.epdcloud.service.DemoService;
/**
 * @Package_name: com.iflytek.epdcloud.controller
 * @Class_name: $CLASS_NAME$
 * @Exception: $Exception$
 * @Describe: TODO
 * @Author: shuaihu2
 * @Creat_date: 2019 2019/1/28 16:37
 **/
@Controller
@RequestMapping("demo")
@Api("swaggerDemo")
public class TestController {
    @Autowired
    private DemoService demoService;

    @ApiOperation(value="测试接口", notes="获取测试用户")
    @ApiImplicitParam(name = "空", value = "空", required = true, dataType = "空")
    @GetMapping("test")
    public String test() {
        return demoService.test();
    }

    @RequestMapping(value = "index" ,method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
