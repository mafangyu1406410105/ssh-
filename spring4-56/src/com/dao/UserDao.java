package com.dao;

import java.util.List;

import entity.Users;

public interface UserDao {
	public boolean checkLogin(Users user);
	public List<Users> getAll();
	public void addUser(Users user);
	public void deleteUser(int id);
	public Users getById(int id);
	public void updateUser(Users user);
	
	
}
