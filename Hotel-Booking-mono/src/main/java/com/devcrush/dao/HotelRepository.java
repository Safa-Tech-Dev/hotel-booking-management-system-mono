package com.devcrush.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcrush.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer>{

	 public Hotel findByHotelId(String hotelId);
}
