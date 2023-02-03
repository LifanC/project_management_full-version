package com.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "number")
	private String number;
	@Column(name = "name")
	private String name;
	@Column(name = "count")
	private Integer count;
	@Column(name = "price")
	private Integer price;
	@Column(name = "day")
	private String day;
	@Column(name = "text")
	private String text;
	@Column(name = "buyday")
	private String buyday;
	@Column(name = "sellday")
	private String sellday;
	public Project() {}
	public Project(String number, String name, Integer count, Integer price, String day, String text,
			String buyday, String sellday) {
		this.number = number;
		this.name = name;
		this.count = count;
		this.price = price;
		this.day = day;
		this.text = text;
		this.buyday = buyday;
		this.sellday = sellday;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getTotalprice() {
		return count * price;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getBuyday() {
		return buyday;
	}
	public void setBuyday(String buyday) {
		this.buyday = buyday;
	}
	public String getSellday() {
		return sellday;
	}
	public void setSellday(String sellday) {
		this.sellday = sellday;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", number=" + number + ", name=" + name + ", count=" + count + ", price=" + price
				+ ", day=" + day + ", text=" + text + ", buyday=" + buyday + ", sellday=" + sellday + "]";
	}
	
	
}