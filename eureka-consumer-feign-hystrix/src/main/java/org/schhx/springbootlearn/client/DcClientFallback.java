package org.schhx.springbootlearn.client;

import org.springframework.stereotype.Component;

@Component
public class DcClientFallback implements DcClient{
    @Override
    public String consumer() {
        return "fallback";
    }
}
