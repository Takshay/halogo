package com.converter.word.service;

import org.springframework.stereotype.Service;

import com.converter.word.model.User;
import com.converter.word.util.CurrencyToWord;

@Service
public class ConverterServiceImpl implements ConverterService {

	@Override
	public User convert(User user) {
		user.setCurrencyInWords(CurrencyToWord.convert(user.getCurrency()));
		return user;
	}

}
