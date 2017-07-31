package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.client.TServiceI;
@Component  
public class TestService {
	@Resource
	TServiceI service;
	

	public String getString() {
		return service.getName();
	}
	
}
