package com.lizy.web.config.redis;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 使用redis做缓存
 * @author River.li
 *
 */

@Configuration
@EnableCaching/*启动缓存的开关*/
public class RedisConfig extends CachingConfigurerSupport{
	
	@Bean
	public KeyGenerator keyGenerator() {
		 return new KeyGenerator() {
	            @Override
	            public Object generate(Object o, Method method, Object... objects) {
	                StringBuilder sb = new StringBuilder();
	                sb.append(o.getClass().getName()).append(".");
	                sb.append(method.getName());
	                for (Object obj : objects) {
	                    sb.append(".").append(obj.toString());
	                }
	                System.out.println("keyGenerator=" + sb.toString());
	                return sb.toString();
	            }
	        };

    }

	  @Bean
	    public CacheManager cacheManager(RedisConnectionFactory factory) {
	        RedisCacheConfiguration cacheConfiguration =RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(60));	      
	        // 对每个缓存空间应用不同的配置
	        Map<String, RedisCacheConfiguration> configMap = new HashMap<>();
	        configMap.put("item", cacheConfiguration);
	        configMap.put("user", cacheConfiguration.entryTtl(Duration.ofSeconds(30)));
	        RedisCacheManager cacheManager = RedisCacheManager.builder(factory).withInitialCacheConfigurations(configMap)
	                .build();
	        return cacheManager;
	    }

	  @Bean
      public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
         RedisTemplate<Object, Object> template = new RedisTemplate<>();
         template.setConnectionFactory(connectionFactory);

         //使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值
         Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);

         ObjectMapper mapper = new ObjectMapper();
         mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
         mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
         serializer.setObjectMapper(mapper);

         template.setValueSerializer(serializer);
         //使用StringRedisSerializer来序列化和反序列化redis的key值
         template.setKeySerializer(new StringRedisSerializer());
         template.afterPropertiesSet();
         return template;
      }



}