package com.ibm.nht;

import java.util.ArrayList;
import java.util.List;


public class UserDao {
	public List<User> getAllUsers(){
		List<User> userList = new ArrayList<User>();
		
		User user1 = new User(100,"Chris", "IT");
		User user2 = new User(101,"Kier", "IT");
		User user3 = new User(102,"Joseph", "IT");
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		return userList;
		
	}

}
class User {
	private int num;
	private String name;
	private String role;
	protected User(int num, String name, String role) {
		this.num = num;
		this.name = name;
		this.role = role;
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
