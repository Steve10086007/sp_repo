package com.jt;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMybatisPlus {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void insert() {
		User user = new User();
		user.setName("mybatisplus");
		user.setAge(19);
		user.setSex("男");
		int row = userMapper.insert(user);
		System.out.println("入库完成");
	}
	//查询用户列表信息
	//将对象不为null的属性当做where条件
	//条件:age=18
	@Test
	public void testFind() {
		//1.使用方法封装
		//User user = new User();
		//user.setAge(18);//得到需要判断的条件
		//直接使用字段赋值
		QueryWrapper<User> queryWrapper = new QueryWrapper<User>();//条件构筑式
		//测试等于
		queryWrapper.eq("age",18);
		//测试大于
		//queryWrapper.gt("age", 18);
		//测试小于
		//queryWrapper.lt("age", 18);
		 /* 
		 * eq = 意思是等于
		 * gt > 意思是大于
		 * lt < 意思是小于
		 */

		List<User> userList = 
				userMapper.selectList(queryWrapper);//接收条件
		System.out.println(userList);		
	}
	/**
	 * 3.数据更新 将年龄为18岁的用户改为19岁
	 * entity:需要修改数据的值
	 * updateWrapper 条件构造器,从当where条件
	 */
	@Test
	public void testUpdate() {
		User user = new User();
		user.setAge(19);//要修改为的值
		UpdateWrapper<User> updatewrapper =
				new UpdateWrapper<>();
		updatewrapper.eq("age", 18);//修改的条件
		userMapper.update(user,updatewrapper);
	}
	//删除name字段为null的数据
	@Test
	public void deleteUser() {
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.isNull("name");
		userMapper.delete(queryWrapper);
	}
}
