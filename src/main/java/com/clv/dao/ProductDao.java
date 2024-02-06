package com.clv.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.clv.dto.Product;

@Component
public class ProductDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int saveProduct(Product product) {
		String sql = "Insert into product values(?,?,?)";
		return jdbcTemplate.update(sql,product.getId(),product.getName(),product.getPrice());
	}
}
