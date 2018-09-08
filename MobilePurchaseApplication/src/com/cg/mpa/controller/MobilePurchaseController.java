
package com.cg.mpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.mpa.entities.Mobile;
import com.cg.mpa.entities.PurchaseDetails;
import com.cg.mpa.service.MobilePurchaseService;


@Controller
public class MobilePurchaseController {

	@Autowired
	MobilePurchaseService mser;
	@RequestMapping("start")
	public String showHome(Model model)
	{
		List<Mobile> mlist = mser.getAllMobiles();
		model.addAttribute("mlist", mlist);
		return "Home";
	}
	
	@RequestMapping("buy")
	public String showPurchasePage(@RequestParam("mid")Integer mid, Model model)
	{
		PurchaseDetails pdetails = new PurchaseDetails();
		pdetails.setMobileid(mid);
		model.addAttribute("pdetails", pdetails);
		return "purchase";
		
	}
	
	
	@RequestMapping("purchase")
	public String insertPurchase(@Valid@ModelAttribute("pdetails")PurchaseDetails pdetails, 
			BindingResult res, Model model )
	{
		if(res.hasErrors())
		{
			model.addAttribute("pdetails", pdetails);
			return "purchase";
		}
		else{
			mser.insertPurchaseDetails(pdetails);
			model.addAttribute("pdetails", pdetails);
			return "success";
		}
	}
}
