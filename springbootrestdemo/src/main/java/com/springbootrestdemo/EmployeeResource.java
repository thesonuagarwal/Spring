package com.springbootrestdemo;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	
	@Autowired
	EmployeeRepository repo;
	
	@RequestMapping(path="employees",method=RequestMethod.GET)
	public List<Employee> getEmployees(){
		
		List<Employee> employees = (List<Employee>) repo.findAll();
		/*
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(1006);
		emp1.setName("John Doe");
		emp1.setPoints(20);
		emp1.setDepartment("Administration");
		emp1.setSalary(10000);
		
		Employee emp2 = new Employee();
		emp2.setId(1007);
		emp2.setName("Simon Kat");
		emp2.setPoints(25);
		emp2.setDepartment("Administration");
		emp2.setSalary(12000);
		
		employees.add(emp1);
		employees.add(emp2);*/
		return employees;
		
	}
	
	@RequestMapping(path="employees/{id}",method=RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") int id){
		
		Employee emp = (Employee) repo.findOne(id);
		return emp;
		
	}
}
