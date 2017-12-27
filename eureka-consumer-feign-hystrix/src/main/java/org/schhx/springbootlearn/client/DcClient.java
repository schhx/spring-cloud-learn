package org.schhx.springbootlearn.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wosai-mac on 2017/11/24.
 */
@FeignClient(name = "eureka-client", fallback = DcClientFallback.class)
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
