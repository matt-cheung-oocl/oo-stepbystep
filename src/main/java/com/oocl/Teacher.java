package com.oocl;

import java.util.List;

public class Teacher extends Person {
	List<Integer> teachingClass;

	@Override
	public String introduce() {
		return ("My name is "+ name +". I am "+ age +" years old. Teaching for the future of world. ");
	}

	public String welcomeStudent(Class klass, Student student) {
		return (introduce() + "Welcome " + student.getName() + " join Class " + klass.getClassNum() + ".");
	}

	public String welcomeLeader(Class klass, Student leader) {
		return (introduce() + leader.getName() + " is the leader of Class " + klass.getClassNum() + ".");
	}
}
