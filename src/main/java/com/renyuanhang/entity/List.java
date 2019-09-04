package com.renyuanhang.entity;


public class List implements java.io.Serializable {

	//columns START
	private Integer lid;
	private String lname;
	//columns END
	public List(){
	}
	public List(Integer lid,String lname){
		this.lid=lid;		this.lname=lname;	}

	public void setLid(Integer lid){
		this.lid=lid;
	}
	public Integer getLid(){
		return lid;
	}

	public void setLname(String lname){
		this.lname=lname;
	}
	public String getLname(){
		return lname;
	}
}

