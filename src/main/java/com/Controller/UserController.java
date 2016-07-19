package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Model.User;
import com.Service.UserService;

@RestController
public class UserController {
	
	 @Autowired
	 UserService userService;
	
	@RequestMapping(value="/save",
			method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User savedUser = userService.create(user);
		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
	}
	
	
//	@RequestMapping( value="/msg",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
//	public String test(){
//		return "{msg:SpringBootJdbc}";
//	}
}
 
