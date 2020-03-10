package com.lastlysly.fallback;

import com.lastlysly.api.UserDemoApi;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2019-09-02 14:59
 **/
@Component
public class UserDemoApiFallBack implements UserDemoApi {
    @Override
    public String getUser(int id) {
        return "错误，服务降级";
    }

    @Override
    public List<Map> getUserList() {
        List<Map> list = new LinkedList<>();
        Map<String,String> map = new HashMap<>();
        map.put("message","错误，服务降级");
        list.add(map);
        return list;
    }
}
