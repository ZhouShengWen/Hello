package com.yangzi.Dao;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.yangzi.c.User;

public class UserDaoImp extends HibernateTemplate implements UserDao {

	@Override
	public void save(User u) {
		super.save(u);
	}

}
