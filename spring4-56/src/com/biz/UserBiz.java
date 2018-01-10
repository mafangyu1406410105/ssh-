package com.biz;

import java.util.List;

import entity.Users;

public interface UserBiz {
	public boolean checkLogin(Users user);
	public List<Users> getAll();
	public void addUser(Users user);
	public void deleteUser(int id);
	public Users getById(int id);
	public void updateUser(Users user);
}
