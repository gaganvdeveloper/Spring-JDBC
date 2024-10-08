package com.clv.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.clv.dto.User;
@Component
public class UserMapper implements RowMapper<User>{
	@Autowired
	private User user;
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setSalary(rs.getDouble("salary"));
		return user;
	}

}
