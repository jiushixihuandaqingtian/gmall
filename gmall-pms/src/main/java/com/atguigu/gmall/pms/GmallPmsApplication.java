package com.atguigu.gmall.pms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
        log.info("商品服务启动成功");
    }

}
