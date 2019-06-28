package com.jt.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/* 为对象的属性赋值.当前对象必须交给spring管理*/
@Component  //Map<k,v> key=user
@ConfigurationProperties(prefix="user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private String username;
	private Integer age;
	
	
	//@Value("${user.id}") //从容器中取值之后赋值
	 //默认值 null
	//@Value("${user.username}")	
	//@Value("${user.age}")
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + "]";
	}

	
}
