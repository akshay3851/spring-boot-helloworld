package com.akshay.springbothelloworld.controller;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
// @Controller
public class HelloController {

    private Map<String, Object> result = new HashMap<>();

    @RequestMapping("/hello")
    // @ResponseBody
    public Map<String,Object> hello(){
        result.put("name","Akshay");
        result.put("City","Faridabad");
        return result;
    }

}
