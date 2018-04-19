package hystrixmavensample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableAutoConfiguration
@EnableHystrix
@EnableEurekaClient
@EnableFeignClients(basePackages = {"hystrixmavensample", "hystrixmavensample.feigninterfaces"})
public class HystrixMavenSample {
    public static void main(String[] args) {
        SpringApplication.run(HystrixMavenSample.class, args);
    }
}