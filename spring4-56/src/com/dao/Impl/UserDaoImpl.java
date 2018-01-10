package com.dao.Impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.UserDao;

import entity.Users;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public boolean checkLogin(Users user) {
		// TODO Auto-generated method stub
		// 编写hql语句
		//String hql = "select u from users u where u.username=? and u.password=?";
		//List<Users> list = super.getHibernateTemplate().find(hql,
		//	//	new Object[] { user.getUsername(), user.getPassword() });
		//if (list.size() > 0) {
		//	return true;
		//}
		//return false;public boolean checkLogin(Users user) {
		//获得一个模板类，该模板类提供了很多的增，删，改，查的方法
		//HibernateTemplate ht=super.getHibernateTemplate();
		//编写hql语句
		String hql="select u from Users u where u.username=? and u.password=?";
		List<Users> list=super.getHibernateTemplate().find(hql, new Object[]{user.getUsername(),user.getPassword()});
		if(list.size()>0){
			return true;
		}
		return false;
	}

	public List<Users> getAll() {
		List<Users> list=super.getHibernateTemplate().find("from Users");
		return list;
	}

	public void addUser(Users user) {
		super.getHibernateTemplate().save(user);
		
	}

	public void deleteUser(int id) {
		Users user=super.getHibernateTemplate().get(Users.class, id);
		super.getHibernateTemplate().delete(user);
	}

	public Users getById(int id) {
		Users user=super.getHibernateTemplate().get(Users.class, id);
		
		return user;
	}

	public void updateUser(Users user) {
		super.getHibernateTemplate().update(user);
	}

	}

