package com.oocl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Class {
	public int classNum;
	public List<Student> listOfStudent = new ArrayList<Student>();
	public Student classLeader;
	public Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		if (teacher.teachingClass.size() < 5) {
			teacher.teachingClass.add(this.classNum);
			this.teacher = teacher;
		}
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public Student getClassLeader() {
		return classLeader;
	}

	public void setClassLeader(Student student) {
		if (listOfStudent.contains(student)) {
			this.classLeader = student;
			teacher.welcomeLeader(this, student);
			for (Student stu : listOfStudent) {
				stu.welcomeLeader(this, student);
			}
		}
	}

	public List<Student> getListOfStudent() {
		return listOfStudent;
	}

	public void setListOfStudent(List<Student> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}

	public void appendStudentMember(Student student) {
		teacher.welcomeStudent(this, student);
		for (Student stu : listOfStudent) {
			stu.welcomeClassmate(this, student);
		}
		this.listOfStudent.add(student);
	}
}