package com.iflytek.epdcloud.controller;

import com.iflytek.epdcloud.service.DemoService;
import com.iflytek.epdcloud.vo.Msg;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @Package_name: com.iflytek.epdcloud.controller
 * @Class_name: $CLASS_NAME$
 * @Exception: $Exception$
 * @Describe: TODO
 * @Author: shuaihu2
 * @Creat_date: 2019 2019/1/28 16:37
 **/
@Controller
@Api
public class TestController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "test",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    public String test() {
        return demoService.test();
    }

    @RequestMapping("login")
    public String index2(){
        return "login";
    }

    @RequestMapping("/")
    public String index(Model model){
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }

}
