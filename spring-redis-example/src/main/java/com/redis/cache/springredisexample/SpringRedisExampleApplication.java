package com.redis.cache.springredisexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.redis.cache.springredisexample.model.User;
 // Before starting application , start the redis server :D:\Projects\redis : redis-server
//http://localhost:8084/rest/user/all
//https://www.youtube.com/watch?v=eYfopvusG_s
@SpringBootApplication
public class SpringRedisExampleApplication {
	
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}
	
	@Bean
	RedisTemplate<String, User> redisTemplate() {
		RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRedisExampleApplication.class, args);
	}

}
