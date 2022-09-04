package com.daniel.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Car {

	@Id
	private String _id;
	
	private String car_id;

	private String title;
	private String brand;
	private String price;
	private Integer age;
	private Date data;
	
	public Car() {
		
	}

	
	public Car(String _id,String car_id, String title, String brand, String price, Integer age) {
		super();
		this._id = _id;
		this.car_id = _id;
		this.title = title;
		this.brand = brand;
		this.price = price;
		this.age = age;
	}
	public String get_car_id() {
		return _id;
	}
	public void set_car_id(String _id) {
		this._id = _id;
	}
		public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this.car_id = _id;
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

	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
}
