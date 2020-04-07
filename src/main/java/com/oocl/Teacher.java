package com.oocl;

public class Teacher extends Person {

	@Override
	public String introduce() {
		return ("My name is "+ name +". I am "+ age +" years old. Teaching for the future of world.");
	}
}
