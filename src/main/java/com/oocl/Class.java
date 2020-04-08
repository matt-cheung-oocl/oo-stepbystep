package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private int classNum;
	private List<Student> listOfStudent = new ArrayList<Student>();
	private Student classLeader;
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		if (teacher.getTeachingClass().size() < 5) {
			teacher.addTeachingClass(this.classNum);
			this.teacher = teacher;
		}
		else
			System.out.println("Teaching Class > 5, can't teach anymore class.");
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
		else
			System.out.println(student.getName() + " is not in Class " + this.classNum);
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