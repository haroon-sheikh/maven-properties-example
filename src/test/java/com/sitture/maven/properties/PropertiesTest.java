package com.sitture.maven.properties;

import org.junit.Test;

public class PropertiesTest {

	@Test
	public void canGetProperty() {
		System.out.println(System.getProperty("property.package"));
	}

}
