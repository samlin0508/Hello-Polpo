package com.polpolink.hellopolpo.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.polpolink.hellopolpo.service.IHelloPolpoService;

@Controller
public class HelloPolpoController {
	private IHelloPolpoService helloPolpoService;
	
	@Autowired
	public HelloPolpoController(IHelloPolpoService helloPolpoService) {
		this.helloPolpoService = helloPolpoService;
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Map<String, Object> model) {
		model.put("hello", helloPolpoService.hello("polpolink.com"));
		return "hello";
	}
	
	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public String helloWithName(@PathVariable("name") String name, Map<String, Object> model) {
		model.put("hello", helloPolpoService.hello(name));
		return "hello";
	}
}
