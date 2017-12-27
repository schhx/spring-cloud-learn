package org.schhx.springbootlearn.controller;

import org.schhx.springbootlearn.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
