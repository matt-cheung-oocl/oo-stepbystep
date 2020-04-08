package com.oocl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassTest {
	@Test
	public void test_teacher_welcome_classmate() {
		String welcome = "My name is Woody. I am 30 years old. Teaching for the future of world. Welcome Tom join Class 2.";

		Class klass = new Class();
		klass.setClassNum(2);

		Teacher teacher = new Teacher();
		teacher.setName("Woody");
		teacher.setAge(30);
		klass.setTeacher(teacher);

		Student student = new Student();
		student.setName("Tom");

		klass.appendStudentMember(student);

		assertEquals(welcome, teacher.getWelcomeClassmateMessage());
	}

	@Test
	public void test_student_welcome_classmate() {
		String welcome = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome Jim join Class 2.";

		Class klass = new Class();
		klass.setClassNum(2);

		Teacher teacher = new Teacher();
		teacher.setName("Woody");
		teacher.setAge(30);
		klass.setTeacher(teacher);

		Student tom = new Student();
		tom.setName("Tom");
		tom.setClassNum(2);
		tom.setAge(18);

		Student jim = new Student();
		jim.setName("Jim");

		klass.appendStudentMember(tom);
		klass.appendStudentMember(jim);

		assertEquals(welcome, tom.getWelcomeClassmateMessage());
	}

	@Test
	public void test_teacher_welcome_leader() {
		String welcome = "My name is Woody. I am 30 years old. Teaching for the future of world. Tom is the leader of Class 2.";

		Class klass = new Class();
		klass.setClassNum(2);

		Teacher teacher = new Teacher();
		teacher.setName("Woody");
		teacher.setAge(30);
		klass.setTeacher(teacher);

		Student tom = new Student();
		tom.setName("Tom");
		tom.setClassNum(2);
		tom.setAge(18);

		klass.appendStudentMember(tom);
		klass.setClassLeader(tom);

		assertEquals(welcome, teacher.getWelcomeLeaderMessages());
	}

	@Test
	public void test_student_welcome_leader() {
		String welcome = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL. Jim is the leader of Class 2.";

		Class klass = new Class();
		klass.setClassNum(2);

		Teacher teacher = new Teacher();
		teacher.setName("Woody");
		teacher.setAge(30);
		klass.setTeacher(teacher);

		Student tom = new Student();
		tom.setName("Tom");
		tom.setClassNum(2);
		tom.setAge(18);

		Student jim = new Student();
		jim.setName("Jim");

		klass.appendStudentMember(tom);
		klass.appendStudentMember(jim);
		klass.setClassLeader(jim);

		assertEquals(welcome, tom.getWelcomeLeaderMessages());
	}
}