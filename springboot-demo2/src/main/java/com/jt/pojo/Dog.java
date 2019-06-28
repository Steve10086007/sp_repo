package com.jt.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource(value="classpath:/propertise/dog.properties")
public class Dog {
	@Value("${dog.id}")
	private Integer id;
	@Value("${dog.name}")
	private String name;
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + "]";
	}
	
	
}
