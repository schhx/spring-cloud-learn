package org.schhx.springcloudlearn.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by wosai-mac on 2017/11/24.
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

    @GetMapping("/exception1")
    Map error();
}
