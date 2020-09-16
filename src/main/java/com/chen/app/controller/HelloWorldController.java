package com.chen.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        for (int i = 0; i < 100000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("hhh");
                }
            }, "thread-" + i);
            thread.start();
        };
        return "hello";
    }

    @GetMapping("/computer")
    public Long computer(){
        Long c = 0L;
        for (int i = 0; i < Integer.MAX_VALUE /2; i++) {
            c+=i;
        }
        System.out.println(c);
        return c;
    }
}
