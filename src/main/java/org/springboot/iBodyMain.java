package org.springboot;

import org.springboot.Demo01.Entity.HealthDataResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class iBodyMain {
    public static void main(String[] args) {
        SpringApplication.run(iBodyMain.class,args);
        System.out.println("Hello world!");
    }
}