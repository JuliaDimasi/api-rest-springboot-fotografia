package com.example.demo.controller;

public class photo {
	
	private Long idPhoto;
	private String section;
	private String pathImg;
	private String description;
	
	public photo() {
	}
	
	public photo(Long idPhoto, String section, String pathImg, String description) {
		this.idPhoto = idPhoto;
		this.section = section;
		this.pathImg = pathImg;
		this.description = description;		
	}
	
	public Long getIdPhoto() {
		return idPhoto;
	}
	public void setIdPhoto(Long idPhoto) {
		this.idPhoto = idPhoto;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getPathImg() {
		return pathImg;
	}
	public void setPathImg(String pathImg) {
		this.pathImg = pathImg;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

