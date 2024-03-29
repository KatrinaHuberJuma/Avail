package com.kat.avail.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kat.avail.models.Availability;
import com.kat.avail.models.User;
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
		
		 @RequestMapping("/everybody")
		    public String first(Model model, HttpSession session) {
			 List<Object[]> days = availabilityService.allDaysAndRatings();
			 model.addAttribute("days", days);
		        return "firstpage.jsp";
		    }
		 
		 
		 @RequestMapping("/employee-view")
		    public String editRating(@ModelAttribute("availability") Availability availability, Model model, HttpSession session) {
			 Long id =  (Long) session.getAttribute("userId");
			 
			 
			 User user= userService.findUserById(id);
			 model.addAttribute("user", user);
			
		        return "EmployeeView.jsp";
		    }
		 
		 
//		 TODO THIS NEEDS TO BE FIXED OMG SO MUCH 
		 
		 @RequestMapping(value="/availability-edit/{id}",  method=RequestMethod.PUT)
		    public String updateIdea(@PathVariable("id") Long id, Model model, @ModelAttribute("availability") Availability availability, BindingResult result) {
				
			 System.out.println(result.toString());
			 if (result.hasErrors()) {
		            return "redirect:/employee-view";
		        } else {
		        	availabilityService.updateAvailability(availability);
		        	return  "redirect:/employee-view";
		        }
		    }
		 
		
}