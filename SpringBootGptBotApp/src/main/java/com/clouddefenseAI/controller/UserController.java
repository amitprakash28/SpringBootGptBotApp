package com.clouddefenseAI.controller;


import com.clouddefenseAI.model.RegisterUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/")
public class UserController {


	@PostMapping("v1/register")
	public ResponseEntity regiterUser(@RequestBody(required = true) RegisterUser registerUser) {
		/**
		 * Register user and store details using the provided payload
		 */
		return new ResponseEntity(HttpStatus.OK);
	}


}
