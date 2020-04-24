package com.springbootrestdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Employee {
	@Id
	@Column(name="employee_id")
	private int id;
	
	@Column(name="employee_name")
	private String name;
	
	@Column(name="employee_dept")
	private String department;
	
	@Column(name="employee_sal")
	private float salary;
	
	@Column(name="employee_points")
	private int points;
	
	
	public Employee(){
		this.id = 0;
		this.name="Not Available";
		this.points=0;
		this.department="Not Available";
		this.points=0;
	}
	
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department="
				+ department + ", salary=" + salary + ", points=" + points
				+ "]";
	}
	
	
}
