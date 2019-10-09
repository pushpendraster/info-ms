package com.infotech.ms.infoaccount.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.ms.infoaccount.dto.UserDto;
import com.infotech.ms.infoaccount.dto.UserRegistrationDto;
import com.infotech.ms.infoaccount.service.AccountService;

@RestController
public class AccountController {

	private final AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	@PostMapping
	public UserDto createNewAccount(@RequestBody UserRegistrationDto user) {
		return accountService.create(user);
	}
}
