package com.jt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.controller.UserController;
import com.jt.pojo.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestCRUD {
	//执行新增数据
	@Autowired // 从容器中取值
	private UserController userController;
	
	@Test
	public void insertUser() {
		User user = new User();
		user.setName("苏妲己").setAge(100).setSex("男");	
		System.out.println("入库成功");
		
				
	}
	
}	
