package com.oocl;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

	@Test
	public void testPerson() {
		Person person = new Person();
		person.setName("Tom");
		person.setAge(21);

		assertEquals("My name is Tom. I am 21 years old.", person.introduce());
	}
}