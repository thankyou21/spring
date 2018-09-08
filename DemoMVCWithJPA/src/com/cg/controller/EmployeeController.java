package com.cg.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.cg.entities.Employee;
import com.cg.service.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService eser;

	@RequestMapping("start")
	public String showInsertPage(Model model)
	{
		model.addAttribute("emp",new Employee());
		return "insert";
	}
	
	@RequestMapping("insert")
	public String insertEmp(@Valid @ModelAttribute("emp")Employee emp, BindingResult res, Model model)
	{
		if(res.hasErrors())
		{
			model.addAttribute("emp", emp);
			return "insert";
		}
		else
		{
			eser.insertEmp(emp);
			model.addAttribute("emp", emp);
			return "success";
		}
	}
}
