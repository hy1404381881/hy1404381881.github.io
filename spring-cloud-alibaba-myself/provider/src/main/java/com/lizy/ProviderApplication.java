package com.lizy;

@SpringBootApplication
@EnableDiscoveryClient  //开启nacos的服务发现
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}