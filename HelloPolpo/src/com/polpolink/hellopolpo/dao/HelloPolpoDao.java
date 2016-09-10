package com.polpolink.hellopolpo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository()
public class HelloPolpoDao implements IHelloPolpoDao {

	@Override
	public List<Map<String, Object>> getData() {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>(); 
		map.put("Framework", "Maven");
		map.put("Language", "Java");
		map.put("Description", "for building, packaging, auto-adding references");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "Git");
		map.put("Language", "C, Shell, Perl, Tcl and Python");
		map.put("Description", "a distributed version control system");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "Spring MVC");
		map.put("Language", "Java");
		map.put("Description", "a MVC framework");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "Spring IoC");
		map.put("Language", "Java");
		map.put("Description", "a DI Container");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "Spring JdbcTemplate");
		map.put("Language", "Java");
		map.put("Description", "a Wrapped Class for JDBC");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "Servlet API 3.1");
		map.put("Language", "Java");
		map.put("Description", "for deploying static resources(js, css, images...)");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "AngularJS");
		map.put("Language", "Javascript");
		map.put("Description", "a Model-View-Whatever javascript framework");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "ui-grid");
		map.put("Language", "Javascript");
		map.put("Description", "a AngularJS based powerful grid ui");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "jQuery");
		map.put("Language", "Javascript");
		map.put("Description", "a javascript library");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "MariaDB");
		map.put("Language", "C, C++, Perl, Bash");
		map.put("Description", "a MySQL-equivalent database");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "Spark");
		map.put("Language", "Java");
		map.put("Description", "a distributed computing platform");
		result.add(map);
		map = new HashMap<String, Object>(); 
		map.put("Framework", "Cassandra");
		map.put("Language", "Java");
		map.put("Description", "a distributed NoSQL");
		result.add(map);
		return result;
	}

}
