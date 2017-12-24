package org.schhx.springbootlearn.controller;

import org.schhx.springbootlearn.properties.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Autowired
    Info info;

    @GetMapping("/info")
    public Info info(){
        return info;
    }
}
