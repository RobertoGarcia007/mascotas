package com.trabajo_final.mascotas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.trabajo_final"})
@EntityScan("com.trabajo_final.model")
@EnableJpaRepositories("com.trabajo_final.dao")


public class MascotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MascotasApplication.class, args);
	}

}
