package com.devcrush.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcrush.model.Guest;

public interface GuestRepository extends JpaRepository<Guest, Integer>{

	public Guest findByBookingId(String bookingid );
	
}
