package test;

import org.junit.Assert;
import org.junit.Test;

import application.Person;

public class MethodTest {
	@Test
	public void shouldReturnAnInstanceOfMethod() {
		Person person1 = new Person();
		Assert.assertNotNull(person1);
	};
}
