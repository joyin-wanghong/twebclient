package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.TestService;

@Controller
@RequestMapping("/testservice")
public class TestController {
	
	@Resource
	private TestService service;
	
	
	@RequestMapping("/test")
	@ResponseBody
	public Object getString() {
		String value = service.getString();
		System.out.print("ssss");
		return value;
	} 
	
	@RequestMapping("/testphp")
	@ResponseBody
	public Object testPhpWs() {
		String value = service.testPHPweb();
		System.out.print(value);
		return value;
	} 
	
	

}
