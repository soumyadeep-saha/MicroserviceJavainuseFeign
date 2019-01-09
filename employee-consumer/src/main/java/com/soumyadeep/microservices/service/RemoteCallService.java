package com.soumyadeep.microservices.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soumyadeep.microservices.controller.Employee;

@FeignClient(name="employee-producer")
public interface RemoteCallService {
	
	@RequestMapping(method=RequestMethod.GET, value="/employee")
	public Employee getData();

}
