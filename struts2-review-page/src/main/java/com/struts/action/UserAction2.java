package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.bean.User;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年4月9日 下午4:36:53 
* 类说明  使用模型驱动的方式获取表单数据
*/
@SuppressWarnings("serial")
public class UserAction2 extends ActionSupport implements ModelDriven<User>{
	
	//前提要求：实体对象的属性名称和表单的name必须一致
	private User user = new User();
	
	@Override
	public User getModel() {
		return user;
	}
	
	public String addUser(){
		System.out.println("AddUser2 ....");
		return "add";
	}
	
	public String addUserDo(){
		System.out.println("AddUserDo2 ....");
		System.out.println(user+"--------------------");
		return "addDo";
	}


}
 