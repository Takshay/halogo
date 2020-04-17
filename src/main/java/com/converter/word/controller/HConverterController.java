package com.converter.word.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.converter.word.model.User;
import com.converter.word.service.ConverterService;
import com.converter.word.service.UserService;

@CrossOrigin("http://localhost:4200")
@RestController
public class HConverterController {

	@Autowired
	ConverterService converterService;

	@Autowired
	UserService userService;
	
	
	@PostMapping("/convert")
	public ResponseEntity<User> convert(@RequestBody User user) {
		if(user.getCurrency() < 0) {
			return ResponseEntity.badRequest().body(user);
		}
		return ResponseEntity.ok().body(converterService.convert(user));
	}
	
	@PostMapping("/save")
	public ResponseEntity<User> create(@RequestBody User user){
		return ResponseEntity.ok().body(userService.save(user));
	}

	@GetMapping()
	public ResponseEntity<List<User>> getEmployees(){
		return ResponseEntity.ok().body(userService.getUsers());
	}

	@GetMapping("/employee/{key}")
	public ResponseEntity<User> getEmployee(@PathVariable(value = "key") int key){
		return ResponseEntity.ok().body(userService.getUser(key));
	}
}
