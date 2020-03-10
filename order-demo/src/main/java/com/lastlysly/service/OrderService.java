package com.lastlysly.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-07-31 16:53
 *
 * 使用restTemplate
 **/
@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "userFallback") //restTemplate服务降级
    public String getUser(int id){
        //获取用户信息，，使用服务名不用ip（后续负载均衡用ip不合适）
        String url = "http://springcloud-demo-user-demo/test/user2/{id}";

        String info = restTemplate.getForObject(url,String.class,id);
        return info;
    }

    //添加服务器降级处理方法
    public String userFallback(int id){
        return "restTemplate请求出问题，服务降级";
    }
}
