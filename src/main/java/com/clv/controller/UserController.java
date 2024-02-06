package com.clv.controller;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.clv.config.SpringJdbcConfig;
import com.clv.dao.UserDao;
import com.clv.dto.User;

public class UserController {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
		UserDao dao = (UserDao)context.getBean("userDao");
		
		
		/*
		 * User user = new User(); user.setId(203); user.setName("Uroš Riznić");
		 * user.setSalary(300000.98); int result = dao.saveUser(user);
		 * System.out.println(result+" row Inserted!!");
		 */
		 
		
		//System.out.println(dao.getUser(202));
		
		
		/*
		 * List<Map<String, Object>> users = dao.getAllUser();
		 * 
		 * for (Map<String, Object> user : users) {
		 * System.out.println("User Id = "+user.get("id"));
		 * System.out.println("User Name = "+user.get("name"));
		 * System.out.println("User Salary ="+user.get("salary")); System.out.println();
		 * }
		 */
		/*
		 * System.out.println("Before Update"); System.out.println(dao.getUser(202));
		 * System.out.println(dao.updateUser(202, 600000.0)+" Row Updated!!");
		 * System.out.println("After Update"); System.out.println(dao.getUser(202));
		 */
		
		int result = dao.deleteUser(202);
		if (result==1) {
			System.out.println("Deleted!!");
		} else {
			System.out.println("Not Deleted");
		}
		 
	}

}
