package com.shareidea.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shareidea.dao.IBaseDao;
import com.shareidea.entity.BaseEntity;

@SpringBootApplication
public class ShareIdeaJavaBackendMain {
	 
    public static void main(String[] args) {
        //System.setProperty("database.properties", "my-app");
        SpringApplication.run(ShareIdeaJavaBackendMain.class, args);
    }
    @Bean
    CommandLineRunner init(IBaseDao baseDao) {

        return args -> {

           

        };
    }
}