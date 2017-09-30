package com.sitture.maven.properties;

import org.junit.Test;

import org.junit.Assert;

public class PropertiesTest {

	@Test
	public void canGetProperty() {
		String prop1 = System.getProperty("my.Property");
		String prop2 = System.getProperty("her.Property");
		
		System.out.println(prop1);		
		System.out.println(prop2);
		
		Assert.assertNotNull(prop1);
		Assert.assertNotNull(prop2);
	}

}
