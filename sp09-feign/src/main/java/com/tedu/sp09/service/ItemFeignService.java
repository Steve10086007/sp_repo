package com.tedu.sp09.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;

@FeignClient(name="item-service", fallback = ItemFeignServiceFB.class)
public interface ItemFeignService {
	/**
	 * Feign 利用我们熟悉的String MVC注解,
	 * 来反向生成访问路径
	 * 
	 * 根据Mapping中指定的路径,在主机地址后面拼接路径
	 * http://localhost:8001/{orderId}
	 * 
	 * 根据@PathVariable配置,把参数数据,拼接到路径当中
	 * 假设参数是"123"
	 * http://localhost:8001/123
	 * 
	 * 向拼接的路径,来转发调用
	 */
	@GetMapping("/{orderId}")
	JsonResult<List<Item>> getItems(@PathVariable String orderId);
	/**
	 * 根据配置,拼接下面的路径,并向下面的路径发送请求
	 * http://localhost:8001/decreaseNumber
	 * @param items
	 * @return
	 */
	@PostMapping("/decreaseNumber")
	JsonResult decreaseNumber(@RequestBody List<Item> items);
}
