package com.infotech.ms.infoaccount.service;

import org.springframework.stereotype.Service;

import com.infotech.ms.infoaccount.client.AuthServiceFeignClient;
import com.infotech.ms.infoaccount.dto.UserDto;
import com.infotech.ms.infoaccount.dto.UserRegistrationDto;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}