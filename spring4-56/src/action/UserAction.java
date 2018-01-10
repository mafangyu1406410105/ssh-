package action;

import java.util.List;

import com.biz.UserBiz;

import entity.Users;



public class UserAction  {
//action������ҵ���߼���
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
	//action������ҵ���߼���
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
	//�����¼�ķ���
	public String login(){
		
		boolean flag=userbiz.checkLogin(user);
		if(flag==true){
			return "success";
		}
		return "error";
		
		
	}
	//�����ѯ����
	public String getAll(){
		
		list=userbiz.getAll();
		return "success";
	}
	//������ӷ���
	public String addUser(){
		
		userbiz.addUser(user);
		return "success";
	}
	//����ɾ������
	public String deleteUser(){
		
		userbiz.deleteUser(id);
		return "success";
	}
	//�������userid��ѯ
	public  String getById(){
		user=userbiz.getById(id);
		return "success";
		
	}
	//�����޸Ĳ���
	public String update(){
		userbiz.updateUser(user);
		return "success";
	}
	
	
}
