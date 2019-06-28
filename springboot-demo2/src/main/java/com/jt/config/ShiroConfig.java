package com.jt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jt.pojo.Shiro;

//该类中表示就是xml数据
@Configuration
public class ShiroConfig {
	//public 返回值类型 方法名称(参数列表)
	@Bean
	public Shiro shiro() {
		return new Shiro();
	}
}
