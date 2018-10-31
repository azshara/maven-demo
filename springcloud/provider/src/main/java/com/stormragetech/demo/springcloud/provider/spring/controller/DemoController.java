package com.stormragetech.demo.springcloud.provider.spring.controller;

import com.stormragetech.demo.springcloud.provider.model.User;
import com.stormragetech.demo.springcloud.provider.spring.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: //TODO
 *
 * @author: Xue Bin
 * @version: 1.0.0-SNAPSHOT
 */
@RestController
public class DemoController {

    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        Assert.notNull(demoService, "DemoService cannot be null !!!");
        this.demoService = demoService;
    }

    @PostMapping("/print")
    public String print(@RequestBody User user) {
        return demoService.print(user);
    }

    @PostMapping("/json")
    public String json(@RequestBody User user) {
        return demoService.json(user);
    }

}
