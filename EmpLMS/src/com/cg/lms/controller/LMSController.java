package com.cg.lms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.lms.entities.Employee_leave_details;
import com.cg.lms.service.LMSService;

@Controller
public class LMSController {
	
	@Autowired
	LMSService lser;
	
	@RequestMapping("start")
	public String showRequest(Model model)
	{
		return "show";
	}
	
	@RequestMapping("l")
	public String allLeaves(@RequestParam("empid")Integer empid,Model model)
	{
		List<Employee_leave_details> ldetails = lser.getLeaves(empid); 
		model.addAttribute("ldetails", ldetails);
		return "display";
	}
}
