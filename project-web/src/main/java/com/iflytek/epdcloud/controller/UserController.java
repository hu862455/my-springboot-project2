package com.iflytek.epdcloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.iflytek.epdcloud.dto.WsAccount;
import com.iflytek.epdcloud.dto.WsConsumption;
import com.iflytek.epdcloud.dto.WsUser;
import com.iflytek.epdcloud.service.WsAccountService;
import com.iflytek.epdcloud.service.WsConsumptionService;
import com.iflytek.epdcloud.service.WsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Package_name: com.iflytek.epdcloud.controller
 * @Class_name: $CLASS_NAME$
 * @Exception: $Exception$
 * @Describe: TODO
 * @Author: shuaihu2
 * @Creat_date: 2019 2019/2/28 14:51
 **/
@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    WsUserService UserService;

    @Autowired
    WsAccountService AccountService;

    @Autowired
    WsConsumptionService consumptionService;

    @RequestMapping(value = "addUser")
    @ResponseBody
    public JSONObject addUser(@Valid WsUser user){
        JSONObject result = new JSONObject();
        // 查询数据库中是否已存在指定用户（根据手机号码）
        WsUser inquireUser = new WsUser();
        inquireUser.setPhone(user.getPhone());
        inquireUser.setDelFlag(0);
        WsUser resultUser = UserService.selectByParam(inquireUser);
        if (resultUser == null) {
            result.put("code", 1);
            result.put("msg","已存在相同手机号！");
            return result;
        }

        int insert = UserService.insert(user);
        // 根据id创建账户数据
        WsAccount userAccount = new WsAccount();
        userAccount.setUserId(user.getId());
        AccountService.insert(userAccount);
        // 记录创建账号操作
        WsConsumption consumption = new WsConsumption();
        consumption.setUserId(user.getId());
        consumption.setDate(new Date());
        consumption.setMsg("第一次创建账号！");
        consumptionService.insert(consumption);

        if (insert <= 0){
            result.put("code", 1);
            result.put("msg","新增用户失败！");
            return result;
        }
        result.put("code", 0);
        result.put("msg","新增用户成功！");
        return result;
    }
}
