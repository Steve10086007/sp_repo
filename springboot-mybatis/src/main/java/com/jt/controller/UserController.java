package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;
import com.jt.service.UserService;

@RestController
public class UserController {
	@Autowired
	private static UserService userService;
	//用户通过localhost:8090/findAll获取用户数据
	@RequestMapping("/findAll")
	public List<User> findAll(){
		
		return userService.findAll();
	}
	//用户通过localhost:8090/insert新增用户数据
	@RequestMapping("/insert")
	public int insertUesr(User user){
		
		return userService.insertUesr(user);
	}
} 
