package com.iflytek.epdcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Package_name: com.iflytek.epdcloud
 * @Class_name: $CLASS_NAME$
 * @Exception: $Exception$
 * @Describe: TODO
 * @Author: shuaihu2
 * @Creat_date: 2019 2019/1/28 16:35
 **/
@SpringBootApplication(scanBasePackages = "com.iflytek.epdcloud")
@MapperScan("com.iflytek.epdcloud.mapper")
@EnableTransactionManagement
public class ProjectApiApplication  extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ProjectApiApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjectApiApplication.class);
    }
}
