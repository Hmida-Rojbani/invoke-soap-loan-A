package de.tekup.loan.invoke.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import de.tekup.loan.soap.api.consume.loaneligebilty.CustomerRequest;

@Controller
public class CheckController {
	
	@GetMapping("/check/customer")
	public String checkCustomerForm(Model model) {
		CustomerRequest customerRequest = new CustomerRequest();
		customerRequest.setCibilScore(500);
		model.addAttribute("request", customerRequest);
		return "request";
	}

}