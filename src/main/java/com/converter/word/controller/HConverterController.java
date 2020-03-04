package com.converter.word.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.converter.word.model.User;
import com.converter.word.service.ConverterService;

@RestController
public class HConverterController {

	@Autowired
	ConverterService converterService;
	
	@PostMapping("/convert")
	public ResponseEntity<User> convert(@RequestBody User user) {
		if(user.getCurrency() < 0) {
			return ResponseEntity.badRequest().body(user);
		}
		return ResponseEntity.ok().body(converterService.convert(user));
	}
}
