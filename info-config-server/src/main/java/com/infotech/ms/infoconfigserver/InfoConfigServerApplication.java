package com.infotech.ms.infoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class InfoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfoConfigServerApplication.class, args);
	}

}
