package com.struts.action;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年4月8日 下午4:36:53 
* 类说明 
*/
@SuppressWarnings("serial")
public class UserAction extends ActionSupport {
	
	public String addUser(){
		System.out.println("AddUser ....");
		return "add";
	}
	
	public String addUserDo(){
		System.out.println("AddUserDo ....");
		//第一种方式，使用ActionContext类获取
		ActionContext context = ActionContext.getContext();
		Map<String, Object> map = context.getParameters();
		Set<String>	 keys = map.keySet();
		for (String key : keys) {
			Object[] objs = (Object[]) map.get(key);
			System.out.println("【key="+ key +"】，【value="+ Arrays.toString(objs)+"】");
		}
		
		
		//第二种方式， 使用ServletActionContext类获取
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		System.out.println(username+"----"+password+"-----"+address);
		
		
		//操作三个作用域对象
		//1 request对象
		request.setAttribute("requestName", "requestValue");
		
		//2 session域对象
		HttpSession session = request.getSession();
		session.setAttribute("sessionName", "sessionValue");
		
		
		//3 servletContext 作用域
		ServletContext contexts = ServletActionContext.getServletContext();
		contexts.setAttribute("contextName", "contextValue");
		
		return "addDo";
	}
	
	

}
 