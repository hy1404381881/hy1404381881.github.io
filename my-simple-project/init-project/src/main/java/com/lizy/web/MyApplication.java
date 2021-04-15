package com.lizy.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * 启动类
 * @author River.li
 *
 */
@SpringBootApplication
@ComponentScan("com.lizy.*")/*可以配置扫描多个包*/
@MapperScan("com.lizy.share.mapper")/*扫描mapper接口，生成代理类*/
//@EnableScheduling/*启用定时任务*/
public class MyApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}
