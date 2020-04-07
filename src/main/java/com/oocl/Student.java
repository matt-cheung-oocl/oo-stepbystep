package com.oocl;

public class Student extends Person {

	@Override
	public String introduce() {
		return ("My name is "+ name +". I am "+ age +" years old. Coding for the glory of OOCL");
	}
}
