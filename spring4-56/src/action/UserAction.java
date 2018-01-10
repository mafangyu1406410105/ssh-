package action;

import java.util.List;

import com.biz.UserBiz;

import entity.Users;



public class UserAction  {
//action依赖于业务逻辑层
//private UserBiz userbiz;
//public void setUserbiz(UserBiz userbiz) {
//	this.userbiz = userbiz;
//}
//private Users user;
//public Users getUser() {
//	return user;
//}
//
//public void setUser(Users user) {
//	this.user = user;
//}
//public String login(){
//	boolean flag=userbiz.checkLogin(user);
//	if (flag==true) {
//		return "success";
//	}
//	return "error";
//}
	//action依赖于业务逻辑层
	private UserBiz userbiz;
	
	public void setUserbiz(UserBiz userbiz) {
		this.userbiz = userbiz;
	}

	private Users user;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private List<Users> list;

	public List<Users> getList() {
		return list;
	}

	public void setList(List<Users> list) {
		this.list = list;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	//处理登录的方法
	public String login(){
		
		boolean flag=userbiz.checkLogin(user);
		if(flag==true){
			return "success";
		}
		return "error";
		
		
	}
	//处理查询方法
	public String getAll(){
		
		list=userbiz.getAll();
		return "success";
	}
	//处理添加方法
	public String addUser(){
		
		userbiz.addUser(user);
		return "success";
	}
	//处理删除方法
	public String deleteUser(){
		
		userbiz.deleteUser(id);
		return "success";
	}
	//处理根据userid查询
	public  String getById(){
		user=userbiz.getById(id);
		return "success";
		
	}
	//处理修改操作
	public String update(){
		userbiz.updateUser(user);
		return "success";
	}
	
	
}
