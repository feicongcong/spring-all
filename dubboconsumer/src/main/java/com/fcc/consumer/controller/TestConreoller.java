package com.fcc.consumer.controller;

import com.fcc.consumer.service.TestConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 15:54 2018/6/15/015
 */
@Controller
@RequestMapping("consumer")
public class TestConreoller {

    @Autowired
    private TestConsumer testConsumer;

    @GetMapping("test")
    @ResponseBody
    public String test(){
        testConsumer.consume();
        return "success";
    }
}
