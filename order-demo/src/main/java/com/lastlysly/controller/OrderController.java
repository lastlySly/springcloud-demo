package com.lastlysly.controller;

import com.lastlysly.api.OrderControllerApi;
import com.lastlysly.api.UserDemoApi;
//import com.lastlysly.service.FeignDemoService;
import com.lastlysly.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-07-31 16:54
 **/
@RestController
@RequestMapping("/order")
public class OrderController implements OrderControllerApi {

    @Autowired
    private OrderService orderService;

//    @Autowired
//    private FeignDemoService feignDemoService;

    @Autowired
    private UserDemoApi userDemoApi;


    @Override
    public String sayHello() {
        return "HELLO";
    }

    @RequestMapping("/order")
    public String addOrder(String name,int id){
        //调用用户，查询用户信息
        String result = orderService.getUser(id);
        return "商品"+ name +"生成订单：" + result;
    }

//    @RequestMapping("/order2")
//    public String addOrder2(String name,int id){
//        //调用用户，查询用户信息
//        String result = feignDemoService.getUser(id);
//        return "feign调用测试，商品"+ name +"生成订单：" + result;
//    }

    @RequestMapping("/userList")
    public List<Map> getUserList(){
        List<Map> list = userDemoApi.getUserList();
        return list;
    }

}
    
