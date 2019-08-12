package com.ing.modelbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.modelbank.dto.LoginDto;
import com.ing.modelbank.service.LoginService;

@RestController
@CrossOrigin(allowedHeaders = {"*","/"},origins ={"*","/"})
@RequestMapping("/api")
public class LoginController {
	@Autowired
	LoginService loginService;
	@PutMapping("/login")
	
	public ResponseEntity<String> login(@RequestBody LoginDto loginDto)
	{
		String msg=loginService.login(loginDto);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
		
	
	

}
