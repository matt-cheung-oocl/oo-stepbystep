package com.oocl;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

	@Test
	public void testPerson() {
		String expectedAns = "My name is Tom. I am 21 years old.";
		Person person = new Person();
		person.setName("Tom");
		person.setAge(21);

		assertEquals(expectedAns, person.introduce());
	}
}