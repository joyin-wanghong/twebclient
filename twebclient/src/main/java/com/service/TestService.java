package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.client.LiveWebserviceI;
import com.client.TServiceI;
@Component  
public class TestService {
	@Resource
	TServiceI service;
	
	@Resource
	LiveWebserviceI lservice;
	

	public String getString() {
		return service.getName();
	}
	
	public String testPHPweb() {
		return lservice.add("3", "5");
	}
	
}
