package cn.mldn.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
@SpringBootApplication
//@EnableEurekaClient 
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableZipkinStreamServer
public class Zipkin_8601_StartSpringCloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(Zipkin_8601_StartSpringCloudApplication.class, args);
	}
}
