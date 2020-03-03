package com.converter.word.service;

import org.springframework.stereotype.Service;

import com.converter.word.util.CurrencyToWord;

@Service
public class ConverterServiceImpl implements ConverterService {

	@Override
	public String convert(double currency) {
		return CurrencyToWord.convert(currency);
	}

}
