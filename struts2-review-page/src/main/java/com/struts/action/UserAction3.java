package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.bean.Book;
import com.struts.bean.User;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年4月9日 下午4:36:53 
* 类说明  使用表达式方式获取表单数据
*/
@SuppressWarnings("serial")
public class UserAction3 extends ActionSupport{
	
	//前提要求：实体对象的属性名称和表单的name必须一致
	private User user;
	private Book book;
	
	public String addUser(){
		System.out.println("AddUser3 ....");
		return "add";
	}
	
	public String addUserDo(){
		System.out.println("AddUserDo3 ....");
		System.out.println(user+"--------------------");
		System.out.println(book+"--------------------");
		return "addDo";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
 