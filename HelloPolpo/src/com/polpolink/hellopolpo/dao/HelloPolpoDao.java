package com.polpolink.hellopolpo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository()
public class HelloPolpoDao extends BaseDao implements IHelloPolpoDao {
	@Override
	public List<Map<String, Object>> getData() {
		return this.getJdbcTemplate().queryForList("select * from opensource");
	}

}
