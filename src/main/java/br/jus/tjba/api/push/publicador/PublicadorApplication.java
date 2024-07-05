package br.jus.tjba.api.push.publicador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PublicadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicadorApplication.class, args);
	}

}
