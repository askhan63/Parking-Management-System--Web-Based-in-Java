package com.pms.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pms.entity.AdminInfo;
import com.pms.entity.UserInfo;
import com.pms.entity.VehicleInfo;
import com.pms.service.UserServices;

@Controller
public class ParkingController {
	@Autowired
	private UserServices service;
	@GetMapping("/")
public String index() {
	return "index";
}
	@GetMapping("/adminlogin")
public String adminlogin() {
	return "adminlogin";
}
	@GetMapping("/addAdmin")
public String addAdmin() {
	return "addAdmin";
}
	@PostMapping("/addVehicle")
	public String addVehicle(@ModelAttribute VehicleInfo e, HttpSession session1) {
		service.addVehicle(e);
		System.out.println(e.getParkingNumber());
		session1.setAttribute("msg", "Vehicle added  Sucessfully..");
		return "addVehicle";
	}
	@PostMapping("/adminPage")
	public String addAdmin(@ModelAttribute AdminInfo e, HttpSession sessionAdmin) {
		service.addAdmin(e);
		System.out.println(e.getUsername());
		sessionAdmin.setAttribute("msg", "Admin added  Sucessfully..");
		return "adminPage";
	}
	@GetMapping("/index")
	public String back() {
		
		return "index";
	}
	@PostMapping("/userlogin")
	public String empRegister(@ModelAttribute UserInfo e, HttpSession session) {
		service.addUser(e);
		session.setAttribute("msg", "Registered  Sucessfully..");
		return "userlogin";
	}
//	@PostMapping("/register")
//	public String userRegister(@ModelAttribute UserInfo u, HttpSession session) {
//		service.addUser(u);
//		// System.out.println(u.getUserAddress());
//		session.setAttribute("msg", "Registered SuccessFully!");
//		return "redirect:/";
//	}
	
	@GetMapping("/userpage")
	public String userPage() {
		return "userpage";
	}
	@GetMapping("/viewVehicle")
	public String viewVehicle() {
		return "viewVehicle";
	}
	@GetMapping("/viewVehicleDetails")
	public String viewVehicleDetails() {
		return "viewVehicleDetails";
	}
	@GetMapping("/userlogin")
public String userlogin() {
	return "userlogin";
}
	@GetMapping("/adminPage")
	public String adminP() {
		return "adminPage";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@GetMapping("/dashBoard")
	public String dashBoard() {
		return "dashBoard";
	}
	@GetMapping("/profile")
	public String profile(Model m) {
		List<UserInfo> u =service.getAllUser();
		m.addAttribute("user",u);
		return "profile";
	}
	@GetMapping("/addSpace")
	public String addSpace() {
		return "addSpace";
	}
	@GetMapping("/addVehicle")
	public String addVehicle() {
		return "addVehicle";
	}
	@GetMapping("/outVehicle")
	public String outVehicle() {
		return "outVehicle";
	}
	@GetMapping("/report")
	public String report() {
		return "report";
	}
	@GetMapping("/totalIncome")
	public String tIncome() {
		return "totalIncome";
	}
	
}
