package com.devcrush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GUEST")
public class Guest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique = true)
	private String bookingId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String DOB;
	private String email;
	private String hotelId;
	@Column(name = "No_of_Guest")
	private String noOfGuest;
	@Column(name = "Total_Rooms")
	private int totalRooms ;
	private String mobile;
	@Column(name = "Credit_Card")
	private String creditCard;
	@Column(name = "Bill_Amount")
	private String amount;


//	@ManyToOne
//	private Guest guest;
//	public Guest getGuest() {
//		return guest;
//	}
//
//	public void setGuest(Guest guest) {
//		this.guest = guest;
//	}

	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Guest(long id, String bookingId, String firstName, String lastName, String dOB, String email, String noOfGuest,
			int totalRooms, String mobile, String creditCard, String amount,String hotelId) {
		super();
		this.id = id;
		this.bookingId = bookingId;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		this.email = email;
		this.hotelId = hotelId;
		this.noOfGuest = noOfGuest;
		this.totalRooms = totalRooms;
		this.mobile = mobile;
		this.creditCard = creditCard;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
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
	

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getNoOfGuest() {
		return noOfGuest;
	}

	public void setNoOfGuest(String noOfGuest) {
		this.noOfGuest = noOfGuest;
	}

	public int getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Guest [id=" + id + ", bookingId=" + bookingId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", DOB=" + DOB + ", email=" + email + ", hotelId=" + hotelId + ", noOfGuest=" + noOfGuest
				+ ", totalRooms=" + totalRooms + ", mobile=" + mobile + ", creditCard=" + creditCard + ", amount="
				+ amount + "]";
	}
	
	
	

}
