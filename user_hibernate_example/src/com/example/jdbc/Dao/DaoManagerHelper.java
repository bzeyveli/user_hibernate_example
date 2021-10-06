package com.example.jdbc.Dao;

import java.util.List;

import com.example.jdbc.entity.User;

public interface DaoManagerHelper {
	
	boolean create(User user);
	List<String> read();
	boolean update(User user);
	boolean deletee(int tckn);
}
