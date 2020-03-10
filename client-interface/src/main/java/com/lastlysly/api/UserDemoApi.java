package com.lastlysly.api;

import com.lastlysly.fallback.UserDemoApiFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-08-16 16:07
 **/
@FeignClient(value = "springcloud-demo-user-demo",path = "/test",fallback = UserDemoApiFallBack.class)
public interface UserDemoApi {

    @GetMapping("/user/{id}")
    String getUser(@PathVariable("id") int id);

    @GetMapping("/getUserList")
    List<Map> getUserList();

}
