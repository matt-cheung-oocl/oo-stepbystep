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
}