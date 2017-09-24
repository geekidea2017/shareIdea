package com.shareidea.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserBackenddMain {
	 
    public static void main(String[] args) {
        //System.setProperty("database.properties", "my-app");
        SpringApplication.run(UserBackenddMain.class, args);
    }

}