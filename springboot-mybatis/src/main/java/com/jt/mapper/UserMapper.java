package com.jt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.pojo.User;

public interface UserMapper extends BaseMapper<User>{
	
	//查询全部的user表中的数据
	List<User> findAll();
	/**
	 * 规定:mybatis中要求数据传参必须是单值
	 * 0.本身就是单值
	 * 1.利用对象将数据封装 id age name
	 * 2.将数据封装为map集合
	 * 3.将数据封装为array/list
	 * @param user 
	 * @param user
	 * @return
	 */
	@Insert("insert into user values(null,#{name},#{age},#{sex})")
	int insertUesr(User user);
	
	
}
