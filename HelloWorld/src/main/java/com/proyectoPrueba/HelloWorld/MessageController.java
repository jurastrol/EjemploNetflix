package com.proyectoPrueba.HelloWorld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MessageController {
	
  @Value("${nombre}")
  private String nombre;

  @RequestMapping("/")
  ResponseEntity<Message> home() {
    return new ResponseEntity( new Message("Hello World!"+ nombre) , HttpStatus.ACCEPTED);
  }
}