package com.oocl;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
	@Test
	public void testPerson() {
		Student student = new Student();
		student.setName("Tom");
		student.setAge(18);

		assertEquals("My name is Tom. I am 18 years old. Coding for the glory of OOCL", student.introduce());
	}
}