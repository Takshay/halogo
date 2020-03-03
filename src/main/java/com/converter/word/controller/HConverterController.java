package com.converter.word.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.converter.word.service.ConverterService;

import io.micrometer.core.lang.NonNull;

@RestController
public class HConverterController {

	@Autowired
	ConverterService converterService;
	
	@GetMapping("/convert")
	public String convert(@Valid @NonNull @RequestParam String name,@Valid @NonNull @RequestParam double currency) {
		return converterService.convert(currency);
	}
}
