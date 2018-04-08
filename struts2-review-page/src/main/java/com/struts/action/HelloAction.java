package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年4月8日 上午11:14:19 
* 类说明 
*/
@SuppressWarnings("serial")
public class HelloAction extends ActionSupport {

	@Override
	public String execute(){
		return "success";
	}
}
 