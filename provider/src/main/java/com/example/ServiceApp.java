package com.example;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/28
 * TIme: 9:39
 */
@SpringBootApplication
@MapperScan(basePackages = {"com/example/mapper"})
@EnableDubbo
public class ServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApp.class, args);
    }
}
