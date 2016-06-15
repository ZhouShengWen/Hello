package com.yangzi.t;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangzi.Dao.UserDao;
import com.yangzi.c.User;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao ud = context.getBean("deptDaoImpl",UserDao.class);
		User u = new User();
		u.setName("уехЩ");
		ud.save(u);
	}
}
