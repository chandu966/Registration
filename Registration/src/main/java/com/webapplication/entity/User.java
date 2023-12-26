package com.webapplication.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@NotEmpty(message= "name should not be null")
	private String name;
	@NotEmpty(message= "username should not be empty")
	private String username;
	@NotBlank(message="Enter your password")
	@NotNull
	@Size(min=5, max=10, message="password must be between 5 and 10 characters")
	private String password;
	@NotBlank(message="Enter your email")
	//@Email(message="invalid email address")
	@Email(regexp="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	//@Email(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
	private String email;
	@NotNull
	@Pattern(regexp="^\\d{10}$", message="invalid mobile number")
	private String mob;
	@NotNull
	@Past(message="date of birth must be less than today")
	//@IsAfter(current="1950-01-01")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	//@JsonFormat(pattern="dd-mm-yyyy")
	private Date dob;
	@NotEmpty(message="Mention gender type")
	private String gender;
	@ElementCollection(targetClass = String.class)
	@NotEmpty(message="Enter technolgy")
	private List<String> technology;
	public User() {
		super();
	}
	public User(int userId, String name, String username, String password, String email, String mob, Date dob,
			String gender, List<String> technology) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mob = mob;
		this.dob = dob;
		this.gender = gender;
		this.technology = technology;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getTechnology() {
		return technology;
	}
	public void setTechnology(List<String> technology) {
		this.technology = technology;
	}
	
}
