package com.i3tv.test;

import org.springframework.stereotype.Component;

@Component
public class BeanExample {
	
	private String property;

	public String getProperty() {
		return property;
	}
	
	public void setProperty(String property) {
		this.property = property;
	}

}
