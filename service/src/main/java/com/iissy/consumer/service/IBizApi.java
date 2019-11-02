package com.iissy.consumer.service;

import com.iissy.cloud.domain.Article;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "producer")
public interface IBizApi {
    @RequestMapping("/sayHello")
    String sayHello(@RequestBody Article article);
}