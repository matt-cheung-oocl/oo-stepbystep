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

	public String welcomeClassmate(Class klass, Student student) {
		return (introduce() + "Welcome " + student.getName() + " join Class " + klass.getClassNum() + ".");
	}

	public String welcomeLeader(Class klass, Student leader) {
		return (introduce() + leader.getName() + " is the leader of Class " + klass.getClassNum() + ".");
	}
}
