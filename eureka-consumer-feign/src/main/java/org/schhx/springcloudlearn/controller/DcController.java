package org.schhx.springcloudlearn.controller;

import org.schhx.springcloudlearn.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by wosai-mac on 2017/11/24.
 */
@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc(){
        return dcClient.consumer();
    }

    @GetMapping("/exception")
    public Map error(){
        return dcClient.error();
    }
}
