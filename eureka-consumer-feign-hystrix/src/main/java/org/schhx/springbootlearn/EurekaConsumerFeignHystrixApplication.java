package org.schhx.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerFeignHystrixApplication.class, args);
	}
}
