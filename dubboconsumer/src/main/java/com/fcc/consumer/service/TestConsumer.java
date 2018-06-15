package com.fcc.consumer.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fcc.dubboapi.TestDubboFacade;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 15:19 2018/6/15/015
 */
@Service
public class TestConsumer  {
    @Reference
    public TestDubboFacade testDubboFacade;
    public void consume(){
        System.out.println("开始消费");
        testDubboFacade.test();
    }

}
