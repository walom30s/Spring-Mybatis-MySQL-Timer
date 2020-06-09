package com.sbm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ImportResource(value = {"classpath:applicationContext.xml"})
@EnableScheduling// 2.开启定时任务
public class SbmApplication {
    public static void main(String[] args) {
        SpringApplication.run(SbmApplication.class, args);
    }
}
