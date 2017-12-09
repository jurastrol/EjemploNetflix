package com.proyectoPrueba.HelloWorld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
  private String Nombre = "Juanlu";

  @RequestMapping("/")
  ResponseEntity<Message> home() {
    return new ResponseEntity( new Message("Hello World!"+ Nombre) , HttpStatus.ACCEPTED);
  }
}