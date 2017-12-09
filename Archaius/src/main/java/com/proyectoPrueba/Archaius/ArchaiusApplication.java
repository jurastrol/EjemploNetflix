package com.proyectoPrueba.Archaius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ArchaiusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchaiusApplication.class, args);
	}
}
