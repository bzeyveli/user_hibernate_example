package com.example.jdbc.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.example.jdbc.entity.User;

public class DaoManager implements DaoManagerHelper {

	@Override
	public boolean create(User user) {
		Session session = DaoConnection.session();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> read() {
		Session session = null;
		List<String> list = new ArrayList<String>();
		try {
			session = DaoConnection.session();
			session.beginTransaction();
			list = session.createQuery("select u.lastName from User u where u.tckn =7").getResultList();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}

	@Override
	public boolean update(User user) {

		try {
			Session session = DaoConnection.session();
			session.beginTransaction();
			user = session.get(User.class, user.getTckn());
			user.setLastName("salih");
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deletee(int tckn) {
		try {
			Session session = DaoConnection.session();
			session.beginTransaction();
			User user = session.get(User.class, tckn);
			session.delete(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

}
