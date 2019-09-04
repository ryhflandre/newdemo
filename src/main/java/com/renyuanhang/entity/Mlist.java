package com.renyuanhang.entity;


public class Mlist implements java.io.Serializable {

	//columns START
	private Integer mid;
	private Integer lid;
	//columns END
	public Mlist(){
	}
	public Mlist(Integer mid,Integer lid){
		this.mid=mid;		this.lid=lid;	}

	public void setMid(Integer mid){
		this.mid=mid;
	}
	public Integer getMid(){
		return mid;
	}

	public void setLid(Integer lid){
		this.lid=lid;
	}
	public Integer getLid(){
		return lid;
	}
}

