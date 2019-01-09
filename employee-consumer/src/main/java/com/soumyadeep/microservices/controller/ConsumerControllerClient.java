package com.soumyadeep.microservices.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestClientException;

import com.soumyadeep.microservices.service.RemoteCallService;

@Controller
public class ConsumerControllerClient {

	@Autowired
	private RemoteCallService loadBalancer;

	public void getEmployee() throws RestClientException, IOException {

		try {
			Employee emp = loadBalancer.getData();
			System.out.println(emp.getEmpId());
			System.out.println(emp.getName());
			System.out.println(emp.getDesignation());
			System.out.println(emp.getAddress());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}