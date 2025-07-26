package com.devcrush.controller;

import java.security.Principal;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devcrush.dao.AvailableHotelRepository;
import com.devcrush.dao.HotelRepository;
import com.devcrush.dao.RoomRepository;
import com.devcrush.model.AvailableHotel;
import com.devcrush.model.Hotel;
import com.devcrush.model.Room;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
//	@Autowired
//	private RoomRepository roomRepository;
//	@Autowired
//	private HotelRepository hotelRepository;
	
	@Autowired
	private AvailableHotelRepository availableHotelRepository;

	@RequestMapping("/addHotel")
	public String addHotel(Model model) {
		
		Random random = new Random();
		int hotelId = random.nextInt(1000);
//		guest.setBookingId("BK001"+bookingId);
		
		model.addAttribute("hotelid","HTL001"+hotelId);
		model.addAttribute("title","AddHotel-Hotel Booking Management System");
		
		return "admin/addHotel";
	}
	
	@RequestMapping(value = "/addHotel",method = RequestMethod.POST)
	public String hotelSuccess(@ModelAttribute("hotel") AvailableHotel availableHotel, Model model) {
		
		String hotel_Id=availableHotel.getHotelId();
		String hotel_name=availableHotel.getHotelName();
		availableHotelRepository.save(availableHotel);
		
		model.addAttribute("hotelID",hotel_Id );
		model.addAttribute("hotelName",hotel_name );
		model.addAttribute("title","Success-Hotel Booking Management System");
		
		return "admin/hotelSuccess";
	}
	
//	@RequestMapping("/addRoom")
//	public String addRoom(Model model) {
//		
//		model.addAttribute("title","AddRoom-Hotel Booking Management System");
//		
//		return "admin/roomDetails";
//	}
//	
//	@RequestMapping(value = "/addRoom",method = RequestMethod.POST)
//	public String roomSuccess(@ModelAttribute("room") Room room, Model model) {
//		
////		String hotelId = principal.g;
////		System.out.println(hotelId);
////		Hotel hotel = hotelRepository.findByHotelId();
////		System.out.println(hotel);
////		hotel.getRoom().add(room);
//		roomRepository.save(room);
//		model.addAttribute("title","Success-Hotel Booking Management System");
//		
//		return "admin/roomSuccess";
//	}
}
