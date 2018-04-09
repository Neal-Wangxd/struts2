package com.struts.bean; 
/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年4月8日 下午7:10:45 
* 类说明 
*/
public class User {
	
	private String username;
	private String password;
	private String address;
	
	public User() {
		super();
	}
	public User(String username, String password, String address) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", address=" + address + "]";
	}
	
}
 