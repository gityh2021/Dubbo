package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import handler.DubboHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/28
 * TIme: 16:36
 */
@RestController
public class DubboController {
    @Reference
    private DubboHandler dubboHandler;

    @RequestMapping(value = "dubbo", method = RequestMethod.GET)
    public String test(){
        System.out.println("进入controller");
        return dubboHandler.sayHello();
    }
}
