package com.devcrush.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String hotelId;
	@Column(name = "Hotel_Name")
	private String hotelName;
	@Column(name = "GST_NO")
	private String gst;
	private String address;
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "hotel")
	private List<Room> room;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(String hotelId, String hotelName, String gst, String address, String city, List<Room> room) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.gst = gst;
		this.address = address;
		this.city = city;
		this.room = room;
	}

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

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Room> getRoom() {
		return room;
	}

	public void setRoom(List<Room> room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", gst=" + gst + ", address=" + address
				+ ", city=" + city + ", room=" + room + "]";
	}
	
	
}
