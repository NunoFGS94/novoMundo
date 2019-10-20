package com.mundoNovo.mundoNovo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MundoNovoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MundoNovoApplication.class, args);

	}

}
