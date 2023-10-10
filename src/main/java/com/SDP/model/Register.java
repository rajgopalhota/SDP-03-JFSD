package com.SDP.model;

import jakarta.persistence.*;

@Entity
@Table(name = "register")
public class Register {

	@Id
	@Column(name = "tidf")
	private int id;
	@Column(name = "firstName1")
	String firstName;

	@Column(name = "lastName1")
	String lastName;

//	@Column(name = "email")
//	private String email;
//	
//	@Column(name = "phone")
//	private String phone;
//	
//	@Column(name = "password")
//	private String password;
//	
//	@Column(name = "gender")
//	private String gender;
//	
//	@Column(name = "aadharNumber")
//	private String aadharNumber;
//	
//	@Column(name = "panNumber")
//	private String panNumber;
//	
//	@Column(name = "imagePath")
//	private String imagePath;
//	
//	@Column(name = "signaturePath")
//	private String signaturePath;
//
	public Register() {
	}

	public Register(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//
//	public Register(Long id, String firstName, String lastName, String email, String phone, String password,
//			String gender, String aadharNumber, String panNumber, String imagePath, String signaturePath) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.phone = phone;
//		this.password = password;
//		this.gender = gender;
//		this.aadharNumber = aadharNumber;
//		this.panNumber = panNumber;
//		this.imagePath = imagePath;
//		this.signaturePath = signaturePath;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getAadharNumber() {
//		return aadharNumber;
//	}
//
//	public void setAadharNumber(String aadharNumber) {
//		this.aadharNumber = aadharNumber;
//	}
//
//	public String getPanNumber() {
//		return panNumber;
//	}
//
//	public void setPanNumber(String panNumber) {
//		this.panNumber = panNumber;
//	}
//
//	public String getImagePath() {
//		return imagePath;
//	}
//
//	public void setImagePath(String imagePath) {
//		this.imagePath = imagePath;
//	}
//
//	public String getSignaturePath() {
//		return signaturePath;
//	}
//
//	public void setSignaturePath(String signaturePath) {
//		this.signaturePath = signaturePath;
//	}

}
