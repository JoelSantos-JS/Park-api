package com.joel.br.Parkapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ParkApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkApiApplication.class, args);
	}

}
