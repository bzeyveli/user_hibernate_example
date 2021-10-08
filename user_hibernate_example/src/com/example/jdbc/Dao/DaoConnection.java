package com.example.jdbc.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.jdbc.entity.User;

public class DaoConnection {
	
	private static SessionFactory sessionFactor;

	public static SessionFactory sessionFactory() {
		return new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class).buildSessionFactory();
	}
	
	public static Session session() {
		sessionFactor = sessionFactory();
		Session session=sessionFactor.openSession();
		return session;
	}
}
