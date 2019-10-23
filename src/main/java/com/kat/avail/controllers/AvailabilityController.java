package com.kat.avail.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kat.avail.models.Availability;
import com.kat.avail.services.AvailabilityService;
import com.kat.avail.services.UserService;
@Controller
public class AvailabilityController {
	    private final UserService userService;
	    private final AvailabilityService availabilityService;
		public AvailabilityController(UserService userService, AvailabilityService availabilityService) {
			this.userService = userService;
			this.availabilityService = availabilityService;
		}
		
		 @RequestMapping("/first")
		    public String first(Model model) {
			 List<Availability> allA= availabilityService.allWeek();
			 model.addAttribute("availabilities", allA);
		        return "firstpage.jsp";
		    }
		 
		
	}