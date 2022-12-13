package com.projetos.projeto5.controllers;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("projeto_5")
public class MessageController {
	
	//Acessar headers especifico
	@GetMapping(value= "/headers_1")
	public ResponseEntity getMessageController (@RequestHeader(value="clienId") String clientId){
		log.info("Chamou o endpoint");
		return new ResponseEntity("Cliente ID: " + clientId, HttpStatus.OK);
	}
	//Acessar todos os headers
	@GetMapping(value= "/headers_2")
	public ResponseEntity getMessageController (@RequestHeader HttpHeaders headers){
		log.info("Chamou o endpoint");
		return new ResponseEntity("Cliente ID: " + headers.get("clientId" ) , HttpStatus.OK);
	}

}
