package com.polpolink.hellopolpo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloPolpoService implements IHelloPolpoService {
	public String hello(String name) {
		return "Hello, " + name;
	}
}