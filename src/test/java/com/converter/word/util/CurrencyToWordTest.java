package com.converter.word.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CurrencyToWordTest {

	@Test
	void convert_1_negative() {
		assertEquals("INVALID INPUT", CurrencyToWord.convert(-1));
	}

	@Test
	void convert_2_zero() {
		assertEquals("ZERO DOLLAR", CurrencyToWord.convert(0));
	}

	@Test
	void convert_3_Long() {
		assertEquals("ONE DOLLAR", CurrencyToWord.convert(1));
	}
	
	@Test
	void convert_4_Long() {
		assertEquals("TWENTY-THREE DOLLARS", CurrencyToWord.convert(23));
	}
	
	@Test
	void convert_5_Tens() {
		assertEquals("ONE HUNDRED AND TWENTY-THREE DOLLARS", CurrencyToWord.convert(123));
	}
	
	@Test
	void convert_6_Tens_Decimal() {
		assertEquals("ONE HUNDRED AND TWENTY-THREE DOLLARS AND FOURTY-FIVE CENTS", CurrencyToWord.convert(123.45));
	}

	@Test
	void convert_7_Tens_Decimal() {
		assertEquals("ONE HUNDRED AND TWENTY-THREE DOLLARS AND FIVE CENTS", CurrencyToWord.convert(123.05));
	}

	//321654.99
	@Test
	void convert_8_Tens_Decimal() {
		assertEquals("ONE HUNDRED AND TWENTY-THREE DOLLARS AND ONE CENT", CurrencyToWord.convert(123.01));
	}

	@Test
	void convert_9_Tens_Decimal() {
		assertEquals("ONE HUNDRED AND TWENTY-THREE DOLLARS AND NINTY-NINE CENTS", CurrencyToWord.convert(123.990));
	}

	@Test
	void convert_10_Tens_Decimal() {
		assertEquals("NINTY-NINE CENTS", CurrencyToWord.convert(0.990));
	}

	@Test
	void convert_11_MAX() {
		assertEquals("NINE HUNDRED AND NINTY MILLION AND NINE HUNDRED AND NINE THOUSAND AND NINTY DOLLARS", CurrencyToWord.convert(990909090));
	}
}
