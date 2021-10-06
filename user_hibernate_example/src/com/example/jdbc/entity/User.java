package com.example.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "users") 

public class User {
	
	@Id 
	@Column(name = "tckn")
	private int tckn;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "sur_name")
	private String surName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;

	public int getTckn() {
		return tckn;
	}

	public void setTckn(int tckn) {
		this.tckn = tckn;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [tckn=" + tckn + ", lastName=" + lastName + ", surName=" + surName + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}
