package com.oocl;

import java.util.List;

public class Class {
	public List<Student> listOfStudent;
	public Student classLeader;

	public Student getClassLeader() {
		return classLeader;
	}

	public void setClassLeader(Student student) {
		if (listOfStudent.contains(student))
			this.classLeader = student;
	}

	public List<Student> getListOfStudent() {
		return listOfStudent;
	}

	public void setListOfStudent(List<Student> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}

	public void appendStudentMember(Student student) {
		this.listOfStudent.add(student);
	}
}