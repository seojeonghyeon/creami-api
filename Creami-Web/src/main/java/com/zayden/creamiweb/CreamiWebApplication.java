package com.zayden.creamiweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class CreamiWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreamiWebApplication.class, args);
	}

}
