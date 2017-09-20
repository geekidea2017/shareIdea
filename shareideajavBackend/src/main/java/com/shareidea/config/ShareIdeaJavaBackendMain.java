package com.shareidea.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ShareIdeaJavaBackendMain {
	 
    public static void main(String[] args) {
        //System.setProperty("database.properties", "my-app");
        SpringApplication.run(ShareIdeaJavaBackendMain.class, args);
    }

}