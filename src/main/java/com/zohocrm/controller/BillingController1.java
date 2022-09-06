package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.services.BillingService;

@Controller
public class BillingController1 {
     
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/listallbills")
	public String listAllBills(ModelMap model) {
		 List<Billing> bills = billingService.findAllBills();
		model.addAttribute("bills",bills);
		return"billing_result";
	}
}
	