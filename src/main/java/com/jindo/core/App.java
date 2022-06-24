package com.jindo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author ManhKM on 6/24/2022
 * @project spring-socket
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("-----> SERVER STARTED!!!");
    }
}
