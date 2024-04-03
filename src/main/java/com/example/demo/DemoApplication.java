package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        System.out.println("home01");

        return "mes01";
    }

    public static void main(String[] args) {
        System.out.println("start01");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("end01");
    }

}
