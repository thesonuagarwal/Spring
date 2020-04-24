/**
 * 
 */
package com.springbootrestdemo;

import org.springframework.data.repository.CrudRepository;

/**
 * @author sonu.agarwal
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
