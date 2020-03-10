package com.lastlysly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-07-31 16:21
 **/
@SpringBootApplication
//开启Eureka客户端
@EnableEurekaClient
public class UserApp {
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class,args);
    }
}
