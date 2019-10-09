package com.infotech.ms.infoidentityserver.model;

import org.springframework.security.core.GrantedAuthority;

public enum Authorities implements GrantedAuthority {
	ROLE_USER;

	@Override
	public String getAuthority() {
		return name();
	}

}
