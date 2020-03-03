package com.converter.word.model;

public class User {

	private String name;
	private double currency;
	private String currencyInWords;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCurrency() {
		return currency;
	}
	public void setCurrency(double currency) {
		this.currency = currency;
	}
	public String getCurrencyInWords() {
		return currencyInWords;
	}
	public void setCurrencyInWords(String currencyInWords) {
		this.currencyInWords = currencyInWords;
	}
}
