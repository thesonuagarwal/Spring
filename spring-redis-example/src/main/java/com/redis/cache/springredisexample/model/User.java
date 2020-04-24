package com.redis.cache.springredisexample.model;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Long salary;
	public User(String id2, String name2, long l) {
		// TODO Auto-generated constructor stub
		id = id2;
		name = name2;
		salary = l;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}

}
