package com.renyuanhang.entity;


public class Movie implements java.io.Serializable {

	//columns START
	private Integer mid;
	private String mname;
	private String mabout;
	private String mleader;
	private String mdate;
	//columns END
	private String lnames;
	private Integer[] lids;
	public Movie(){
	}
	public Movie(Integer mid,String mname,String mabout,String mleader,String mdate){
		this.mid=mid;		this.mname=mname;		this.mabout=mabout;		this.mleader=mleader;		this.mdate=mdate;	}


	
	public Integer[] getLids() {
		return lids;
	}

	public void setLids(Integer[] lids) {
		this.lids = lids;
	}

	public String getLnames() {
		return lnames;
	}

	public void setLnames(String lnames) {
		this.lnames = lnames;
	}

	public void setMid(Integer mid){
		this.mid=mid;
	}
	public Integer getMid(){
		return mid;
	}

	public void setMname(String mname){
		this.mname=mname;
	}
	public String getMname(){
		return mname;
	}

	public void setMabout(String mabout){
		this.mabout=mabout;
	}
	public String getMabout(){
		return mabout;
	}

	public void setMleader(String mleader){
		this.mleader=mleader;
	}
	public String getMleader(){
		return mleader;
	}

	public void setMdate(String mdate){
		this.mdate=mdate;
	}
	public String getMdate(){
		return mdate;
	}
}

