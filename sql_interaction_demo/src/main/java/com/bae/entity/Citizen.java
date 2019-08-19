package com.bae.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id")
	private Long id;
	@Column(name="citizenid")
	private Long citizenID;
	@Column(name="forenames")
	private String forenames;
	@Column(name="surname")
	private String surname;
	@Column(name="homeaddress")
	private String homeAddress;
	@Column(name="dateofbirth")
	private Date dateOfBirth;
	@Column(name="sex")
	private String sex;
	
	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCitizenID() {
		return citizenID;
	}
	public void setCitizenID(Long citizenID) {
		this.citizenID = citizenID;
	}
	public String getFornames() {
		return forenames;
	}
	public void setFornames(String forenames) {
		this.forenames = forenames;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
}
