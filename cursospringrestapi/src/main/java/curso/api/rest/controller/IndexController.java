package curso.api.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class IndexController {
	  
	
	   @GetMapping(value = "/", produces =  "application/jason")
	public ResponseEntity init() {
		return new ResponseEntity("Olá Usuario REST Spring Boot", HttpStatus.OK);
	}

}
