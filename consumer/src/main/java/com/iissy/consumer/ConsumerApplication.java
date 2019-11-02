package com.iissy.consumer;

import com.iissy.cloud.domain.Article;
import com.iissy.consumer.service.IBizApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
@SpringBootApplication
public class ConsumerApplication {
    @Autowired
    private IBizApi bizApi;

    @RequestMapping("/sayHello")
    public String sayHello() {
        Article article = new Article("id", "title", "body");
        String result = bizApi.sayHello(article);
        return result;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}