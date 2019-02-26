package com.iflytek.epdcloud.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class SwaggerWebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/static/");

        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/**");
//        System.out.println("SwaggerWebMvcConfig  addResourceHandlers"  );
    }
}