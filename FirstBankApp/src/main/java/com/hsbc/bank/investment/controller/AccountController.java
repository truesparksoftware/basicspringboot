package com.hsbc.bank.investment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	@GetMapping("/getbank")
	public String getBank() {
		String message="welcome to spring boot community";
		return message;
	}
	
	@GetMapping("/getAccount")
	public String getBankAccount() {
		String message="welcome to bank account";
		return message;
	}
}
