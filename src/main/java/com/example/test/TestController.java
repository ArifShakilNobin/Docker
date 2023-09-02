package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @Autowired
    TestRepository testRepository;

    @PostMapping("/test")
    public Test saveTest(){
        Test test = new Test();
        test.setId(1L);
        test.setName("nobin");
        testRepository.save(test);
        return test;
    }
}
