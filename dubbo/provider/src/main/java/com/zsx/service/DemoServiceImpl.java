package com.zsx.service;

import org.springframework.stereotype.Service;

/**
 * Created by zsx on 2017/5/31.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "zsx,Hello " + name;
    }
}
