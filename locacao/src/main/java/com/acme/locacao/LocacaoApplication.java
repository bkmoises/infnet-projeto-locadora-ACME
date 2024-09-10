package com.acme.locacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LocacaoApplication {
	public static void main(String[] args) {
		SpringApplication.run(LocacaoApplication.class, args);
	}

}
