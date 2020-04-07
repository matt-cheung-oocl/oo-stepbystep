package com.oocl;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
	@Test
	public void testPerson() {
		String expectedAns = "My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.";

		Student student = new Student();
		student.setName("Tom");
		student.setAge(18);
		student.setClassNum(2);

		assertEquals(expectedAns, student.introduce());
	}
}