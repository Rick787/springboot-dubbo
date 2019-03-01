package com.rick.dubbospringbootconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rick.dubbospringbootapi.DefaultService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @Reference(version = "${demo.service.version}",
                application = "${dubbo.application.id}",
                url = "dubbo://localhost:12345")
    private DefaultService defaultService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return defaultService.defaultMethod(name);
    }

}
