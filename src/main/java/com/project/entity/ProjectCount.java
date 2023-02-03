package com.project.entity;

public class ProjectCount {
	private Integer count;
	private String trueorfalse;
	private String tempnumber;
	private String buydaytime;
	private String selldaytime;

	public ProjectCount() {}

	public ProjectCount(Integer count, String trueorfalse, String tempnumber, String buydaytime, String selldaytime) {
		super();
		this.count = count;
		this.trueorfalse = trueorfalse;
		this.tempnumber = tempnumber;
		this.buydaytime = buydaytime;
		this.selldaytime = selldaytime;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getTrueorfalse() {
		return trueorfalse;
	}

	public void setTrueorfalse(String trueorfalse) {
		this.trueorfalse = trueorfalse;
	}

	public String getTempnumber() {
		return tempnumber;
	}

	public void setTempnumber(String tempnumber) {
		this.tempnumber = tempnumber;
	}

	public String getBuydaytime() {
		return buydaytime;
	}

	public void setBuydaytime(String buydaytime) {
		this.buydaytime = buydaytime;
	}

	public String getSelldaytime() {
		return selldaytime;
	}

	public void setSelldaytime(String selldaytime) {
		this.selldaytime = selldaytime;
	}

	@Override
	public String toString() {
		return "ProjectCount [count=" + count + ", trueorfalse=" + trueorfalse + ", tempnumber=" + tempnumber
				+ ", buydaytime=" + buydaytime + ", selldaytime=" + selldaytime + "]";
	}

	
	



	
	
	
}
