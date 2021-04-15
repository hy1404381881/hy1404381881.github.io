package com.lizy.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动类
 * @author River.li
 *
 */
@SpringBootApplication
@ComponentScan("com.lizy.*")/*可以配置扫描多个包*/
@MapperScan("com.lizy.share.mapper")/*扫描mapper接口，生成代理类*/
@EnableCaching/*启动缓存的开关*/
@EnableTransactionManagement/*启动注解*/
//@EnableScheduling/*启用定时任务*/
public class MyJwtWebApp {
	
	public static void main(String[] args) {
		SpringApplication.run(MyJwtWebApp.class, args);
	}

}
