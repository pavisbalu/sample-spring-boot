package com.example.HelloPavithrrabi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LengthOfWord {

    @RequestMapping("/add")

    public int add(){

        String line="Ashwanth is a mastermind";
        int curr_len=0,res=0;
        for(int i=0;i< line.length();i++){
            if(line.charAt(i) != ' ')
                curr_len++;

            else {
                res = Math.max(res, curr_len);
                curr_len = 0;
            }

        }
        System.out.println(res);
        return Math.max(res,curr_len);
    }
}
