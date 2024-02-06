package com.clv.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.clv.dto.User;
@Component
public class UserDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	UserMapper userMapper;
	
	public int saveUser(User user) {
		String sql =
	"insert into user values('"+user.getId()+"','"+user.getName()+"','"+user.getSalary()+"')";
		return jdbcTemplate.update(sql);
	}
	
	public int updateUser(int id, double salary) {
		String sql = "UPDATE user SET salary ="+salary+" WHERE id="+id;
		return jdbcTemplate.update(sql);
	}
	
	public int deleteUser(int id) {
		String sql ="DELETE FROM user WHERE id ="+id;
		return jdbcTemplate.update(sql);
	}
	
	public User getUser(int id) {
		String sql = "SELECT * FROM user where id ="+id;
		return jdbcTemplate.queryForObject(sql,userMapper );
	}
	
	public List<Map<String, Object>> getAllUser() {
		String sql = "SELECT * FROM user";
		return jdbcTemplate.queryForList(sql);
	}
}
