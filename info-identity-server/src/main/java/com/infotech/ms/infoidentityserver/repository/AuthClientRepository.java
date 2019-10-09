package com.infotech.ms.infoidentityserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infotech.ms.infoidentityserver.model.AuthClientDetails;

@Repository
public interface AuthClientRepository extends JpaRepository<AuthClientDetails, Long>{
	
    Optional<AuthClientDetails> findByClientId(String clientId);


}
