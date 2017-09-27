package com.szhouse.springbootweb;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello word";
    }

    @GetMapping("/get")
    public String get() {
        return "get";
    }

    @PostMapping("/post")
    public String post(@RequestParam(value = "param") String param) {
        return param;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Integer id) {
        return id.toString();
    }

    @PutMapping("/put")
    public String put() {
        return "put";
    }

    @PatchMapping("/patch")
    public String patch() {
        return "patch";
    }
}
