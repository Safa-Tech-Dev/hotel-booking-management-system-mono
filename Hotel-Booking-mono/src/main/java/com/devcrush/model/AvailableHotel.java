package com.devcrush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Available_Hotel")
public class AvailableHotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "Hotel_Id")
	private String hotelId;
	@Column(name = "Hotel_Name")
	private String hotelName;
	private int price;
	private String city;
	@Column(name = "No_Available_Rooms")
	private int availableRoom;
	public AvailableHotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AvailableHotel( String hotelId, String hotelName, String city, int availableRoom,int price) {
		super();
		//this.id = id;
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.city = city;
		this.availableRoom = availableRoom;
	}

	/*
	 * public long getId() { return id; } public void setId(long id) { this.id = id;
	 
	}*/
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAvailableRoom() {
		return availableRoom;
	}
	public void setAvailableRoom(int availableRoom) {
		this.availableRoom = availableRoom;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "AvailableHotel [ hotelId=" + hotelId + ", hotelName=" + hotelName + ", price=" + price
				+ ", city=" + city + ", availableRoom=" + availableRoom + "]";
	}
	

}
