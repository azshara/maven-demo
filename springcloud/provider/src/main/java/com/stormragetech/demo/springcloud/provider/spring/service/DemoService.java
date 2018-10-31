package com.stormragetech.demo.springcloud.provider.spring.service;

import com.stormragetech.demo.springcloud.provider.model.User;

/**
 * description: //TODO
 *
 * @author: Xue Bin
 * @version: 1.0.0-SNAPSHOT
 */
public interface DemoService {

    String print(User user);

    String json(User user);

}
