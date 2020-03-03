package com.converter.word.util;

public class CurrencyToWord {

	private static final String INVALID_INPUT = "INVALID INPUT";
	public static final String[] unitOnes = { "", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN",
			"NINETEEN" };
	public static final String[] unitTens = {"", "", "TWENTY", "THIRTY", "FOURTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINTY"};
	
	public static String convert(final double currency) {
		long dollar = (long)currency;
		long cent = Math.round((currency - dollar) * 100);
		
		if(currency < 0) {
			return INVALID_INPUT;
		}
		
		if(currency == 0) {
			return "ZERO DOLLAR";
		}
		
		StringBuilder currencyInWords = new StringBuilder();
		if(dollar > 0) {
			currencyInWords.append(toWords(dollar)).append((dollar == 1) ? " DOLLAR" : " DOLLARS");
		}
		if(cent > 0) {
			if(currencyInWords.length() > 0) {
				currencyInWords.append(" AND ");
			}
			currencyInWords.append(toWords(cent)).append((cent == 1) ? " CENT" : " CENTS");
		}
		return currencyInWords.toString();
	}

	private static String toWords(double currency) {
		if(currency < 0) {
			return INVALID_INPUT;
		}
		if(currency < 20)
			return unitOnes[(int) currency];
		if(currency < 100)
			return unitTens[(int) currency / 10] + ((currency % 10 >= 1) ? "-" : "") + unitOnes[(int) currency % 10];
		if(currency < 1000)
			return unitOnes[(int) currency / 100] + " HUNDRED" + ((currency % 100 != 0) ? " AND " : "") + toWords(currency % 100);
		if(currency < 1000000)
			return toWords(currency / 1000) + " THOUSAND" + ((currency % 1000 != 0) ? " AND " : "") + toWords(currency % 1000);
		if(currency < 1000000000)
			return toWords(currency / 1000000) + " MILLION" + ((currency % 1000000 != 0) ? " AND " : "") + toWords(currency % 1000000);
		return toWords(currency / 1000000000) + " BILLION" + ((currency % 1000000000 != 0) ? " AND " : "") + toWords(currency % 1000000000);
	} 
}
