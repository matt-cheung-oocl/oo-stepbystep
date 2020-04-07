package com.oocl;

public class Student extends Person {
	public int classNum;

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	@Override
	public String introduce() {
		return ("My name is "+ name +". I am "+ age +" years old. I am a student of class "+ classNum +". Coding for the glory of OOCL.");
	}
}
