package com.tao.controller;

import com.tao.entity.Student;
import com.tao.feign.FeignProviderClient;
import com.tao.feign.impl.FeignError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {
    /*@Autowired
    private FeignProviderClient feignProviderClient;*/
    @Autowired
    private FeignError feignProviderClient;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
