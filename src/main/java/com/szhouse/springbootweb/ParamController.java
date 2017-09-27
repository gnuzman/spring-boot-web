package com.szhouse.springbootweb;

import org.springframework.web.bind.annotation.*;

@RestController
public class ParamController {
    @GetMapping("/requestParam")
    public String requestParam(@RequestParam(value = "id", required = false) Integer id,
                               @RequestParam(value = "name") String name) {
        return id.toString() + name;
    }

    @PostMapping("/requestBody")
    public String requestBody(@RequestBody User user) {
        return user.getId() + user.getName();
    }

    @DeleteMapping("/pathVariable/{id}")
    public String pathVariable(@PathVariable(value = "id") Integer id) {
        return id.toString();
    }

    @GetMapping("/requestHeader")
    public String requestHeader(@RequestHeader(value = "param") String param) {
        return param;
    }
}
