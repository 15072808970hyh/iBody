package org.springboot.Demo01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     * 第一次访问
     * @return
     */
    @GetMapping("/hello")
    public  String hello(){
        return "hello Springbootaa";
    }
}
