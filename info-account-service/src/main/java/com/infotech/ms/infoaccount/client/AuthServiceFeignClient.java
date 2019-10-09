package com.infotech.ms.infoaccount.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.infotech.ms.infoaccount.dto.UserDto;
import com.infotech.ms.infoaccount.dto.UserRegistrationDto;

@FeignClient(name = "auth-service")
public interface AuthServiceFeignClient {

	@PostMapping(value = "/uaa/user")
    UserDto createUser(@RequestBody UserRegistrationDto user);
}
