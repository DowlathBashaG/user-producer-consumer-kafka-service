package io.dowlath.userproducerservice.controller;

import io.dowlath.userproducerservice.service.UserProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userapi")
public class UserController {

    @Autowired
    private UserProducerService userProducerService;

    @PostMapping("/publishUserData/{name}/{age}")
    public void sendUserData(@PathVariable("name") String name, @PathVariable("age") int age){
        userProducerService.sendUserData(name,age);
    }
}
