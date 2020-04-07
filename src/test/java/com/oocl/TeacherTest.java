package com.oocl;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
	@Test
	public void testTeacher() {
		Teacher teacher = new Teacher();
		teacher.setName("Tom");
		teacher.setAge(18);

		assertEquals("My name is Tom. I am 18 years old. Teaching for the future of world.", teacher.introduce());
	}
}