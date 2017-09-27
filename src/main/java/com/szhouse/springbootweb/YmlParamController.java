package com.szhouse.springbootweb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlParamController {
    @Value("${szhouse.param}")
    private Integer param;

    @GetMapping("/ymlParam")
    public Integer ymlParam() {
        return param;
    }
}
