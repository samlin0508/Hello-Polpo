package com.polpolink.hellopolpo.service;

import java.util.List;
import java.util.Map;

public interface IHelloPolpoService {
	public String hello(String name);
	public List<Map<String, Object>> getData();
}
