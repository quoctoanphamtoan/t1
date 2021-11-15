package com.quoctoanphamtoan.khoaluan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ApiTest {
    @GetMapping("/helloword")
    public String helloWord(){
        return "Hello nha";
    }
}
