package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

	private List<Integer> teachingClass = new ArrayList<Integer>();
	private String welcomeClassmateMessage;
	private String welcomeLeaderMessage;

	public List<Integer> getTeachingClass() {
		return teachingClass;
	}

	public void addTeachingClass(int classNum) {
		this.teachingClass.add(classNum);
	}

	public String getWelcomeClassmateMessage() {
		return this.welcomeClassmateMessage;
	}

	public String getWelcomeLeaderMessages() {
		return this.welcomeLeaderMessage;
	}

	@Override
	public String introduce() {
		return ("My name is " + this.getName() + ". I am " + this.getAge() + " years old. Teaching for the future of world. ");
	}

	public void welcomeStudent(Class klass, Student student) {
		this.welcomeClassmateMessage = (introduce() + "Welcome " + student.getName() + " join Class " + klass.getClassNum() + ".");
	}

	public void welcomeLeader(Class klass, Student leader) {
		this.welcomeLeaderMessage = (introduce() + leader.getName() + " is the leader of Class " + klass.getClassNum() + ".");
	}
}
