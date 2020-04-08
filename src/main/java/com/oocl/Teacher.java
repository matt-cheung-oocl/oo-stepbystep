package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	List<Integer> teachingClass = new ArrayList<Integer>();
	public String welcomeClassmateMessage;
	public String welcomeLeaderMessage;

	public String getWelcomeClassmateMessage() {
		return this.welcomeClassmateMessage;
	}

	public String getWelcomeLeaderMessages() {
		return this.welcomeLeaderMessage;
	}

	@Override
	public String introduce() {
		return ("My name is " + name + ". I am " + age + " years old. Teaching for the future of world. ");
	}

	public void welcomeStudent(Class klass, Student student) {
		this.welcomeClassmateMessage = (introduce() + "Welcome " + student.getName() + " join Class " + klass.getClassNum() + ".");
	}

	public void welcomeLeader(Class klass, Student leader) {
		this.welcomeLeaderMessage = (introduce() + leader.getName() + " is the leader of Class " + klass.getClassNum() + ".");
	}
}
