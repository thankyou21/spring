package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Trainee;
import com.cg.service.TraineeService;

@Controller
public class TraineeController
 {
	
	@Autowired
	TraineeService tser;
	
	@RequestMapping("start")
	public String start()
	{
		return "Login";
	}
	
	@RequestMapping("login")
	public String validateCredential(@RequestParam("username")String username, 
			@RequestParam("pwd")String pwd){
		if(username.equals("capg") && pwd.equals("capg"))
		{
			return "Operations";
		}
		return "Invalid";
	}
	
	@RequestMapping("action")
	public String performAction(@RequestParam("choice")String ch, Model model)
	{
		Trainee tr = new Trainee();
		model.addAttribute("tdetails", tr);
		
		switch(ch)
		{
			case "1": return "addTrainee";
			
			case "2": return "deleteTrainee";
			
			case "3": return "modifyTrainee";
			
			case "4": return "retrieveTrainee";
			
			case "5": List<Trainee> tlist = tser.getAllTrainee();
					  model.addAttribute("tlist", tlist); 
					  return "retrieveAllTrainee";
			
		}
		return null;
	}
	
	@RequestMapping("add")
	public String addTraineeDetails(@Valid@ModelAttribute("tdetails")Trainee tdetails, 
			BindingResult res, Model model)
	{
		if(res.hasErrors())
		{
			model.addAttribute("tdetails", tdetails);
			return "addTrainee";
		}
		else{
			model.addAttribute("tdetails", tdetails);
			tser.insertTrainee(tdetails);
			return "added";
		}
		
	}
	
	@RequestMapping("del")
	public String delTrainee(@Valid@ModelAttribute("tid")Integer tid, Model model)
	{
		model.addAttribute("tid", tid);
		tser.delTrainee(tid);
		return "deleted";
	}
	
	@RequestMapping("search")
	public String searchOneTrainee(@Valid@ModelAttribute("tid")Integer tid, Model model)
	{
		model.addAttribute("tid", tid);
		Trainee tdetails = tser.searchTrainee(tid);
		model.addAttribute("tdetails", tdetails);
		return "display";
	}
	
	
	@RequestMapping("modify")
	public String modifyDetails(@Valid@ModelAttribute("tdetails")Trainee tdetails, 
			BindingResult res, Model model)
	{
		if(res.hasErrors())
		{
			model.addAttribute("tdetails", tdetails);
			return "modify";
		}
		else{
			model.addAttribute("tdetails", tdetails);
			tser.modifyTrainee(tdetails);
			return "modified";
	}
			}

}
