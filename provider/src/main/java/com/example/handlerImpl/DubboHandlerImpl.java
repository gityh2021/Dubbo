package com.example.handlerImpl;

import com.alibaba.dubbo.config.annotation.Service;
import handler.DubboHandler;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/28
 * TIme: 9:58
 */
@Service
@Component
public class DubboHandlerImpl implements DubboHandler {
    public String sayHello() {
        return "Hello, This is provider!";
    }
}
