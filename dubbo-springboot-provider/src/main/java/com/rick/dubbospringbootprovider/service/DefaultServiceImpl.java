package com.rick.dubbospringbootprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.rick.dubbospringbootapi.DefaultService;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;

/**
 *
 * @ClassName:  DefaultServiceImpl
 * @Description:对外暴露接口实现类
 * @author: rick
 * @date:   2019年1月30日 15:26:50
 *
 */

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultServiceImpl implements DefaultService {

    public String defaultMethod(String name) {
        System.out.println(name+ "曾经来过");
        return "Hello, " + name + " (from Spring Boot)";
    }
}
