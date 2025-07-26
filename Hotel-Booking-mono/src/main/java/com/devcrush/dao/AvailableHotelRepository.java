package com.devcrush.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devcrush.model.AvailableHotel;

public interface AvailableHotelRepository extends JpaRepository<AvailableHotel, Integer>{

	@Query("SELECT h FROM AvailableHotel h WHERE CONCAT(h.hotelName, ' ', h.city) LIKE %?1%")
	public List<AvailableHotel> searchHotel(String keyword);
	Optional<AvailableHotel>  findByHotelId(String hotelId);
	
	public AvailableHotel findAvailableRoomByHotelId(String hotelId);
}
