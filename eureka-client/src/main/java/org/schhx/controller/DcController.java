package org.schhx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wosai-mac on 2017/11/23.
 */
@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/exception")
    public Map error(HttpServletResponse response){
        response.setStatus(500);
        Map<String, String> map = new HashMap<>(2);
        map.put("type", "java.lang.RuntimeException");
        map.put("msg", "error");
        return map;

    }

}
