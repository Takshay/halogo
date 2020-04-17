package com.converter.word.model;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private String id;
	private int key;
	private String name;
	private double currency;
	private String currencyInWords;
	private int age;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
