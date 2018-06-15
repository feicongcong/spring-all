package com.fcc.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Description:
 * @Author J.W
 * @Date: 上午 9:48 2018/5/22 0022
 */
@Import({
//        // 持久层配置
//        JooqConfig.class,
//        // 资源文件配置
//        MessageSourceAutoConfiguration.class,
//        // json配置
//        JsonConfig.class
})
@ComponentScan(basePackages = {"com.fcc.common", "com.fcc.provider"})
@EnableAsync
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ProviderMain {

    public static void main(String[] args) {

        SpringApplication.run(ProviderMain.class, args);
    }

}
