package com.soumyadeep.microservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soumyadeep.microservices.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee employee = new Employee();
		employee.setName("soumyadeep1");
		employee.setDesignation("Director Technology");
		employee.setEmpId("1");
		employee.setAddress("Bangalore");

		return employee;
	}
}
