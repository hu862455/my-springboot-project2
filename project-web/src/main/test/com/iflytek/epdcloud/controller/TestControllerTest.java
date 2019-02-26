package com.iflytek.epdcloud.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {
    private Logger logger = LoggerFactory.getLogger(TestControllerTest.class);
    private MockMvc mvc;

    @Autowired
    private WebApplicationContext wac; // 注入WebApplicationContext
    @Autowired
    private TestController TestController;

    @Before
    public void setUp() throws Exception {
        //初始化
        mvc = MockMvcBuilders.standaloneSetup(TestController).build();
    }

    @Test
    @WithMockUser(username="admin",roles={"USER","ADMIN"})
    public void test1() throws Exception {
        logger.info("=========开始测试==========");

        String url = "/test";//访问url
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(url).accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)

                .param("page", "1")
        ).andReturn();
        //访问返回状态
        int status = mvcResult.getResponse().getStatus();
        //接口返回结果
        String content = mvcResult.getResponse().getContentAsString();
        logger.info("=========返回结果："+content);
        logger.info("=========返回状态："+status);
        //断言预期结果和状态
//        Assert.assertTrue("成功", status == 200);
//        Assert.assertFalse("错误", status != 200);
        logger.info("=========测试完毕==========");
    }

}