package com.polpolink.hellopolpo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polpolink.hellopolpo.dao.IHelloPolpoDao;

@Service()
public class HelloPolpoService implements IHelloPolpoService {
	@Autowired
	private IHelloPolpoDao helloPolpoDao;
	
	public String hello(String name) {
		return "Hello, " + name;
	}

	@Override
	public List<Map<String, Object>> getData() {
		return this.helloPolpoDao.getData();
	}
}