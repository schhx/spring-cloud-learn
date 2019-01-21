package org.schhx.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class EurekaConsumerFeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerFeignHystrixApplication.class, args);
	}
}
