package com.stormragetech.demo.springcloud.provider.spring.service.impl;

import com.alibaba.fastjson.JSON;
import com.stormragetech.demo.springcloud.provider.model.User;
import com.stormragetech.demo.springcloud.provider.spring.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * description: //TODO
 *
 * @author: Xue Bin
 * @version: 1.0.0-SNAPSHOT
 */
@Service
public class DemoServiceImpl implements DemoService {

    public String print(User user) {
        return user.toString();
    }

    public String json(User user) {
        return JSON.toJSONString(user);
    }
}
