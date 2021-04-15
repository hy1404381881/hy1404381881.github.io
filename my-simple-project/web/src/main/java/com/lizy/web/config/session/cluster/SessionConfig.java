package com.lizy.web.config.session.cluster;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import com.lizy.share.constant.Constant;
/**
 * 共享session的设置，可以用nginx搭建集群
 * @author River.li
 *
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds =Constant.EXPIRE_TIME)//session过期时间单位：秒
public class SessionConfig {
	
}