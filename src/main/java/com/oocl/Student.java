package com.oocl;

public class Student extends Person {
	public int classNum;
	public String welcomeClassmateMessage;
	public String welcomeLeaderMessage;

	public String getWelcomeClassmateMessage() {
		return this.welcomeClassmateMessage;
	}

	public String getWelcomeLeaderMessages() {
		return this.welcomeLeaderMessage;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	@Override
	public String introduce() {
		return ("My name is "+ name +". I am "+ age +" years old. I am a student of class "+ classNum +". Coding for the glory of OOCL. ");
	}

	public void welcomeClassmate(Class klass, Student student) {
		this.welcomeClassmateMessage = (introduce() + "Welcome " + student.getName() + " join Class " + klass.getClassNum() + ".");
	}

	public void welcomeLeader(Class klass, Student leader) {
		this.welcomeLeaderMessage = (introduce() + leader.getName() + " is the leader of Class " + klass.getClassNum() + ".");
	}
}
