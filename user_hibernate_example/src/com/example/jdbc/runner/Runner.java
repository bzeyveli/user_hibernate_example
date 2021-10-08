package com.example.jdbc.runner;

import java.util.List;

import com.example.jdbc.Dao.DaoManager;
import com.example.jdbc.entity.User;

public class Runner {
	public static void main(String[] args) {
		
		User user = new User();
		user.setTckn(10);
		user.setLastName("mehmett");
		user.setSurName("zeyveli");
		user.setEmail("mehmetze@gmail.com");
		user.setPhone("0102120");
		DaoManager daoManager = new DaoManager();
		boolean resultCreate = daoManager.create(user);
		System.out.println("create : " + resultCreate);
		
		List<String> list = daoManager.read();
		for (String item: list) {
			System.out.println(item);
		}
		
		
		boolean resultUpdate = daoManager.update(user);
		System.out.println("update :" + resultUpdate);
		boolean resultDelete = daoManager.deletee(8);
		System.out.println("delete :" + resultDelete);
	}

}
