//package com.lastlysly.service;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
///**
// * @author lastlySly
// * @GitHub https://github.com/lastlySly
// * @create 2019-08-16 15:34
// **/
//@FeignClient(value = "springcloud-demo-user-demo")
//public interface FeignDemoService {
//
//    /**
//     * 这个路由必须和 对应服务下的controller的 路由一样  （controller的路由test + 接口的路由/user/{id} ）
//     * @param id
//     * @return
//     */
//    @RequestMapping(value = "/test/user/{id}",method = RequestMethod.GET)
//    String getUser(@PathVariable("id") int id);
//
//
//}
