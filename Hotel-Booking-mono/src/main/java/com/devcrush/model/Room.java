package com.devcrush.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Table(name = "ROOM")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String roomType;
	private String roomSize;
	private String price;
	private String amenities;
	private String totalRooms;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotel_id" ,nullable = false)
	private Hotel hotel;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(int id, String roomType, String roomSize, String price, String amenities, String totalRooms,
			Hotel hotel) {
		super();
		Id = id;
		this.roomType = roomType;
		this.roomSize = roomSize;
		this.price = price;
		this.amenities = amenities;
		this.totalRooms = totalRooms;
		this.hotel = hotel;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(String roomSize) {
		this.roomSize = roomSize;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	public String getTotalRooms() {
		return totalRooms;
	}
	public void setTotalRooms(String totalRooms) {
		this.totalRooms = totalRooms;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "Room [Id=" + Id + ", roomType=" + roomType + ", roomSize=" + roomSize + ", price=" + price
				+ ", amenities=" + amenities + ", totalRooms=" + totalRooms + ", hotel=" + hotel + "]";
	}
	
	
	

}
