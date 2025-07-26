package com.devcrush.controller;

import java.security.Principal;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.devcrush.dao.AvailableHotelRepository;
import com.devcrush.dao.GuestRepository;
import com.devcrush.dao.UserRepository;
import com.devcrush.model.AvailableHotel;
import com.devcrush.model.Guest;
import com.devcrush.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
//	private AvailableHotel availableHotel;
//	
//	public UserController(AvailableHotel availableHotel) {
//		super();
//		this.availableHotel = availableHotel;
//	}
     
	@Autowired
	private AvailableHotelRepository availableHotelRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private GuestRepository guestRepository;

	@RequestMapping("/guestRegister")
	public String guestRegister(Model model,Principal principal,@RequestParam("id") String hotelId,@RequestParam("price") String price,@RequestParam("rooms") String availableRoom) {
		

//		System.out.println("HotelId "+hotelId);
//		System.out.println("price "+price);
//		System.out.println("Available Room "+availableRoom);
		
		String userName = principal.getName();
//		System.out.println(userName);
		User user = userRepository.getUserByUserName(userName);
		model.addAttribute("user",user);
		model.addAttribute("hotelId",hotelId);
		model.addAttribute("price",price);
		model.addAttribute("AvailableRoom",availableRoom);
		//model.addAttribute("availableRoom", availableRoom);
		model.addAttribute("title","GuestRegister-Hotel Booking Management System");
		
		return "normal/guestRegister";
	}
	@RequestMapping("/welcome")
	public String welcomeUser(Model model,Principal principal) {
		
		String userName = principal.getName();
//		System.out.println(userName);
		User user = userRepository.getUserByUserName(userName);
		model.addAttribute("user",user);
		model.addAttribute("title","Welcome-Hotel Booking Management System");
		
		return "normal/welcome";
	}
	
	@RequestMapping(value = "/addGuest", method = RequestMethod.POST)
	public String addGuest(@ModelAttribute("guest") Guest guest, Model model ,Principal principal) {
		
//			String hotelId = (String) model.getAttribute("hotelId");
			String hotelID = guest.getHotelId();
//			System.out.println(hotelID);
			AvailableHotel availableHotel = availableHotelRepository.findAvailableRoomByHotelId(hotelID);
			int noOfRooms = availableHotel.getAvailableRoom();
			//System.out.println(noOfRooms);
			int bookRooms = guest.getTotalRooms();
			//System.out.println(bookRooms);
			int availableRooms = noOfRooms - bookRooms;
			
			model.getAttribute("price");
//			String hotelId = guest.getHotelId();
//			System.out.println(hotelId);
			Optional<AvailableHotel> optional = availableHotelRepository.findByHotelId(hotelID);
			AvailableHotel availableHotel2 = optional.get();
			availableHotel2.setAvailableRoom(availableRooms);
			availableHotelRepository.save(availableHotel2);
			String userName = principal.getName();
//			System.out.println(userName);
			User user = userRepository.getUserByUserName(userName);
			model.addAttribute("user",user);
			
			Random random = new Random();
			int bookingId = random.nextInt(10000);
			guest.setBookingId("BK001"+bookingId);
			this.guestRepository.save(guest);
			model.addAttribute("guest",guest);
			
		
		return "normal/guestSuccess";
	}
	
	
	@RequestMapping("/seehistory")
	public String seeHistory(Model model,Principal principal) {
		
		
		
		model.addAttribute("title","HISTORY-Hotel Booking Management System");
		
		return "normal/histroy";
	}
	
	@RequestMapping(value="/do_history" ,method = RequestMethod.POST)
	public String doSearchHistory(Model model,@RequestParam("bookingId") String bookingId) {
		
		if(bookingId != null) {
		Guest bokinghistory = guestRepository.findByBookingId(bookingId);
		model.addAttribute("listhsitory", bokinghistory);
		model.addAttribute("title","HISTORY-Hotel Booking Management System");
		
		return "normal/histroy";
		}
		else {
			
			return "normal/histroy";
		}
	}
	
}
