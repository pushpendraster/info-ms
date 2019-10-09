package com.infotech.ms.infoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InfoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfoEurekaServerApplication.class, args);
	}

}
