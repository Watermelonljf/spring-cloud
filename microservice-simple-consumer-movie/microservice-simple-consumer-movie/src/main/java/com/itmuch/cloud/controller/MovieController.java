package com.itmuch.cloud.controller;

import com.itmuch.cloud.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ljianf on 2017/9/30.
 */
@RestController
public class MovieController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id){
        return this.restTemplate.getForObject("http://microserice-simple-privider-user/simple/"+id,User.class);
    }

    @GetMapping("/log-info")
    public void getUserInstance(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microserice-simple-privider-user");
        LOGGER.info("ip:{}port:{}",serviceInstance.getHost(),serviceInstance.getPort());
    }
}
