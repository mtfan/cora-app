package com.cora.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: module项目启动类
 *
 * @Author: fanmingtao
 * @Date: 2019/5/10
 */
@Slf4j
@ComponentScan("com.cora")
@SpringBootApplication
public class CoraWebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CoraWebApplication.class, args);
        log.info("Message App 项目启动成功！");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CoraWebApplication.class);
    }
}
