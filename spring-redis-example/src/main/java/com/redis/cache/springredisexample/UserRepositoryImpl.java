package com.redis.cache.springredisexample;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.redis.cache.springredisexample.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private RedisTemplate<String,User> redisTemplate;
	private HashOperations<String, String, User> hashOperations;
	public UserRepositoryImpl(RedisTemplate<String, User> redisTemplate) {
		this.redisTemplate = redisTemplate;
		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		hashOperations.put("USER", user.getId(), user);
	}

	@Override
	public Map<String,User> findAll() {
		// TODO Auto-generated method stub
		return  hashOperations.entries("USER");
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return (User) hashOperations.get("USER", id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		//hashOperations.put("USER", user.getId(), user);
		save(user);
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		 hashOperations.delete("USER",id);
		
	}
	
}
