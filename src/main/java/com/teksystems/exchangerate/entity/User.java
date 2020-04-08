package com.teksystems.exchangerate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="USER")
public class User {
	@Id
	@Column(name="ID")
	private Long id;
	@Column(name="USERID")
	private String userid;
	@Column(name="PASSWORD")
	private String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
