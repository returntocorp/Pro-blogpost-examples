package com.test;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.*;

@RestController
public class Test1 {
    @RequestMapping(value = "/test1")
    String test1(@RequestParam String input) {
        return Test2.test2(input);
    }
}
