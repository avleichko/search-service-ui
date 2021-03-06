package com.search.service.ui;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UiApplication.class, args);
    }

    @Value(value = "serchServiceUrl")
    private String serchServiceUrl;

    @Value("searchServicePort")
    private String serchServicePort;

}
