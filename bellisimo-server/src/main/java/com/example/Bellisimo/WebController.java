package com.example.Bellisimo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    UserRepository repository;

    @RequestMapping("/")
    public String process()
    {
        repository.save(new User("Martha Mohlala","martha@gmail.com",true));
        return "Done!!";
    }


}
