package com.hei.school.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@CrossOrigin
public class BigSumRestController {
    @GetMapping("/big-sum")
    public BigInteger sum(@RequestParam  BigInteger a, @RequestParam BigInteger b) {
        return a.add(b);
    }
}
