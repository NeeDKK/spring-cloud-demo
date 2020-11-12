package com.needkk.eurekaservice04.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Wu Zijie
 * @date: 2020-11-11 16:09
 * @description:
 */
@RestController
public class TestServiceController {
    @RequestMapping("/service2")
    public String testService() {
        return "Eureka service04";
    }
}
