package com.struts.bean; 
/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年4月9日 下午2:18:14 
* 类说明 
*/
public class Book {
	
	private String name;
	private double price;
	private String author;
	private String desc;
	
	
	
	public Book() {
		super();
	}
	
	public Book(String name, double price, String author, String desc) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", desc=" + desc + "]";
	}
	
}
 