package com.daniel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Car {

	@Id
	private String _id;

	private String title;
	private String brand;
	private String price;
	private Integer age;
	
	public Car() {
		
	}

	
	public Car(String _id, String title, String brand, String price, Integer age) {
		super();
		this._id = _id;
		this.title = title;
		this.brand = brand;
		this.price = price;
		this.age = age;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
