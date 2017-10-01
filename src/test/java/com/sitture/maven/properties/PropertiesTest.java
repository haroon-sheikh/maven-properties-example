package com.sitture.maven.properties;

import org.junit.Test;

import org.junit.Assert;

public class PropertiesTest {

	@Test
	public void canGetProperty() {
		String prop1 = System.getProperty("my.Property");
		String prop2 = System.getProperty("her.Property");
		String prop3 = System.getProperty("pathvar");

		// System.out.println("..........." + System.getenv("PATH"));

		System.out.println(prop1);
		System.out.println(prop2);
		System.out.println(prop3);

		Assert.assertNotNull(prop1);
		Assert.assertNotNull(prop2);
		Assert.assertNotNull(prop3);
	}

}
