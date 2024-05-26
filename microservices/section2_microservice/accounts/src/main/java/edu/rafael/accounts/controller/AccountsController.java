package edu.rafael.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

	@GetMapping("sayHello") //sayHello is a path to invoke this method (URL).
	public String sayHello() {
		return "Hello World";
	}

}
