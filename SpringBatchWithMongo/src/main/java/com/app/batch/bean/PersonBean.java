package com.app.batch.bean;

import java.util.Date;

public class PersonBean {

	private String userName;
	private String phoneNumber;
	private String email;
	private Date dateOfBirth;
	private Integer age;
	private Boolean inRelashionship;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getInRelashionship() {
		return inRelashionship;
	}

	public void setInRelashionship(Boolean inRelashionship) {
		this.inRelashionship = inRelashionship;
	}

}
