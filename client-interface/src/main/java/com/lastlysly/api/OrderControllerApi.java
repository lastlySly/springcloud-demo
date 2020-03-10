package com.lastlysly.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-08-16 16:21
 **/
@FeignClient(value = "springcloud-demo-order-demo",path = "/order")
public interface OrderControllerApi {

    @GetMapping("/hello")
    String sayHello();
}
