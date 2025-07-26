package com.devcrush.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devcrush.dao.AvailableHotelRepository;
import com.devcrush.dao.StateRepository;
import com.devcrush.dao.UserRepository;
import com.devcrush.helper.Message;
import com.devcrush.model.AvailableHotel;
import com.devcrush.model.State;
import com.devcrush.model.User;

@Controller
public class HomeController {

	@Autowired
	private AvailableHotelRepository hotelRepository;
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private UserRepository userRepository;
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("title","Home-Hotel Booking Management System");
		
		return "home";
	}
	

	@RequestMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("title","About-Hotel Booking Management System");
		
		return "about";
	}
	
	@RequestMapping("/register")
	public String register(State state, Model model) {
		
		model.addAttribute("title","Register-Hotel Booking Management System");
		List<State> list = stateRepository.findAll();
		model.addAttribute("stateList",list);
		return "register";
	}
	

	@RequestMapping("/signin")
	public String login(Model model) {
		
		model.addAttribute("title","Login-Hotel Booking Management System");
		
		return "login";
	}
	@RequestMapping("/searchHotel")
	public String searchHotel(Model model) {
		
		model.addAttribute("title","SearchHotel-Hotel Booking Management System");
		
		return "searchResultHotel";
	}	
	
	@RequestMapping(value = "/do_search", method = RequestMethod.POST)
	public String resultHotel(Model model, @RequestParam("keyword") String keyword,HttpSession session ) {
		
		if(keyword  != null) {
			List<AvailableHotel> listHotel = hotelRepository.searchHotel(keyword);
			model.addAttribute("listHotel",listHotel);
			model.addAttribute("keyword",keyword);
//			session.setAttribute("message", new  Message("Available hotels!!","alert-success"));
			return "searchResultHotel";
		}
		else {
//			session.setAttribute("message", new Message("Sorry!!!....No hotel available","alert-danger"));
			return "searchResultHotel";
		}
		
	}
//	
//	@RequestMapping(value = "/do_get_hotel", method = RequestMethod.POST)
//	@ResponseBody
//	public String bookHotel(Model model, @RequestParam("hotelId") String hotelId,@RequestParam("price") String price,HttpSession session ) {
//		
//		System.out.println(hotelId);
//		System.out.println(price);
//		return"Hello";
//		
//	}
	
//	@RequestMapping(value = "/do_get_hotel", method = RequestMethod.POST)
//	public String bookHotel(@ModelAttribute("book") @RequestParam("hotelId") String hotelId,@RequestParam("price") String price) {
//		
//		System.out.println("Hotel Id" +hotelId);
//		System.out.println("Price"+price);
//		
//		return "";
//	}
	
	
	@RequestMapping(value = "/do_register", method = RequestMethod.POST)
	public String userRegister(@ModelAttribute("user") User user, @RequestParam(value = "agreement", defaultValue = "false") boolean agreement,HttpSession session, Model model) {
		
			try {
					if(!agreement) {
						throw new Exception("You have not agreed the terms and conditions");
					}
				
					user.setRole("ROLE_USER");
					System.out.println("user"+user);
					user.setPassword(passwordEncoder.encode(user.getPassword()));
					User result = this.userRepository.save(user);
					
					model.addAttribute("user",user);
					session.setAttribute("message", new  Message(" Registered successfully!!","alert-success"));
					
					return "success";
				
			} catch (Exception e) {
				model.addAttribute("user", new User());
				session.setAttribute("message", new Message("Something went wrong!"+e.getMessage(),"alert-danger"));
				return "register";
			}	
	}
	
	
	
}
