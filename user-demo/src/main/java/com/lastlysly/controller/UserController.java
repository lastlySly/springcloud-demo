package com.lastlysly.controller;

import com.lastlysly.api.UserDemoApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-07-31 16:27
 **/
@RestController
@RequestMapping("/test")
public class UserController implements UserDemoApi {

    @Value("${server.port}")
    private int port;

    @GetMapping("helloFeign")
    public String helloFeign(){
        return "helloFeign";
    }

    @Override
    public String getUser(@PathVariable("id") int id){

        if (id == 1){
            return "用户1号:" + port;
        }else if (id == 2){
            return "用户2号:" + port;
        }else {
            return "其他用户:" + port;
        }

    }
//    继承feign注解的api方式不适用于restTemplate
    @RequestMapping("/user2/{id}")
    public String getUser2(@PathVariable("id") int id){

        if (id == 1){
            return "用户1号:" + port;
        }else if (id == 2){
            return "用户2号:" + port;
        }else {
            return "其他用户:" + port;
        }

    }

    @Override
    public List<Map> getUserList() {

        List<Map> list = new LinkedList<>();

        for(int i = 0; i<10; i++){
            HashMap<String,Object> map = new HashMap<>(16);
            map.put("id",i);
            map.put("name","用户"+ i +"号");
            map.put("age",14 + i);
            list.add(map);
        }

        return list;
    }
}
