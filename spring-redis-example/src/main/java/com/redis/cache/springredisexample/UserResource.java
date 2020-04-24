package com.redis.cache.springredisexample;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redis.cache.springredisexample.model.User;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
	private  UserRepository userRepository;
	
	public UserResource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("add/{id}/{name}")
	public User add(@PathVariable("id") final String id, @PathVariable("name") final String name) {
		this.userRepository.save(new User(id,name,20000L));
		return this.userRepository.findById(id);
	}
	
	@GetMapping("update/{id}/{name}")
	public User update(@PathVariable("id") final String id, @PathVariable("name") final String name) {
		this.userRepository.update(new User(id,name,10000L));
		return this.userRepository.findById(id);
	}
	
	@GetMapping("delete/{id}")
	public  Map<String,User> delete(@PathVariable("id") final String id) {
		this.userRepository.delete(id);
		return this.userRepository.findAll();
	}
	
	@GetMapping("all")
	public Map<String,User> all() {
		return this.userRepository.findAll();
	}
}
