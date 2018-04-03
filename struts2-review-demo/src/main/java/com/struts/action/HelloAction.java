package com.struts.action; 
/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年4月3日 上午10:39:51 
* 类说明  HelloAcrion类
*/
public class HelloAction {
	
	public String execute(){
		System.out.println("【action ......】"+HelloAction.class.hashCode());
		return "OK";
	}

}
 