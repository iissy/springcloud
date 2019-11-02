package com.iissy.website;

import com.iissy.cloud.domain.Article;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class WebsiteApplication {
    @PostMapping("/sayHello")
    public String sayHello(@RequestBody Article article) {
        return String.format("hello2, %s-%s-%s", article.getId(), article.getTitle(), article.getBody());
    }

    public static void main(String[] args) {
        SpringApplication.run(WebsiteApplication.class, args);
    }

}