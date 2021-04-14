package com.ibm.mysqldemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	@GeneratedValue
	@Id
	private int id;
	@NotNull
	private String name;
	private long mobileNumber;
	@NotNull
	@Email
	private String email;
	private Date dobDate;
		
	public Date getDobDate() {
		return dobDate;
	}
	public void setDobDate(Date dobDate) {
		this.dobDate = dobDate;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
