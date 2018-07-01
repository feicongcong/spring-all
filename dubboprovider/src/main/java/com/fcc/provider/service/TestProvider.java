package com.fcc.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fcc.dubboapi.TestDubboFacade;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 15:06 2018/6/15/015
 */
@Service
public class TestProvider implements TestDubboFacade {
    @Override
    public void test(){
        System.out.println("TestProvider被调用");
    }
}
