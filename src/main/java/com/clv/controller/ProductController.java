package com.clv.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.clv.config.SpringJdbcConfig;
import com.clv.dao.ProductDao;
import com.clv.dto.Product;

public class ProductController {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
		ProductDao dao=(ProductDao)context.getBean("productDao");
		Product p1 = new Product();
		p1.setId(1002);
		p1.setName("Dell");
		p1.setPrice(42000.00);
		int result = dao.saveProduct(p1);
		System.out.println(result+" Row Inserted");
	}

}
