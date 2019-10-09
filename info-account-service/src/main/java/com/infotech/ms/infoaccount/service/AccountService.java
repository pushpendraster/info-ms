package com.infotech.ms.infoaccount.service;

import com.infotech.ms.infoaccount.dto.UserDto;
import com.infotech.ms.infoaccount.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}