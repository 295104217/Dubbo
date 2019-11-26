package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class HelloController {

    @Reference //在注册中心查找服务
    private HelloService helloService;

     @RequestMapping("/hello")
     @ResponseBody
     public String getName(String name) {

         String result = helloService.sayHello(name);
         return result;
     }
}
