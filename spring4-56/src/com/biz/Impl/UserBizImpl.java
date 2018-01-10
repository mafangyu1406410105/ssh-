package com.biz.Impl;

import java.util.List;

import com.biz.UserBiz;
import com.dao.UserDao;

import entity.Users;

public class UserBizImpl implements UserBiz {
	private UserDao userdao;

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public boolean checkLogin(Users user) {
		return userdao.checkLogin(user);
	}

	public List<Users> getAll() {
		return userdao.getAll();
	}

	public void addUser(Users user) {
		userdao.addUser(user);
		
	}

	public void deleteUser(int id) {
		userdao.deleteUser(id);
		
	}

	public Users getById(int id) {
		// TODO Auto-generated method stub
		return userdao.getById(id);
	}

	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		userdao.updateUser(user);
	}


}
