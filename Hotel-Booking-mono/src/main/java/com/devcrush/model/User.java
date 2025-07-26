package com.devcrush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(unique = true)
	private String userName;
	private String password;
	private String DOB;
	@Column(unique = true)
	private String email;
	private String state;
	private String mobile;
	private String UAN;
	private String role;
	
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
//	public List<Guest> guest = new ArrayList<>();
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long id, String firstName, String lastName, String userName, String password, String dOB, String email,
			String state, String mobile, String uAN, String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		DOB = dOB;
		this.email = email;
		this.state = state;
		this.mobile = mobile;
		UAN = uAN;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUAN() {
		return UAN;
	}
	public void setUAN(String uAN) {
		UAN = uAN;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
//	
//	public List<Guest> getGuest() {
//		return guest;
//	}
//	public void setGuest(List<Guest> guest) {
//		this.guest = guest;
//	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", DOB=" + DOB + ", email=" + email + ", state=" + state + ", mobile="
				+ mobile + ", UAN=" + UAN + ", role=" + role + "]";
	}
	
	
	
	
}
