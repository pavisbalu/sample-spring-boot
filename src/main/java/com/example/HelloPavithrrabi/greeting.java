package com.example.HelloPavithrrabi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greeting {
    @RequestMapping("/")
   public String index(){
       return "Hello pavithrrabi";
   }
}

