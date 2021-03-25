package com.example.demo.controller;

public class User {
	
	private Long idUser;
	private String name;
	private String lastname;
	private int age;
	private String urlImg;
	
	public User() {
		
	}
	
	public User(Long idUser, String name, String lastname, int age, String urlImg) {
		this.idUser = idUser;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.urlImg = urlImg;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	
	

}
