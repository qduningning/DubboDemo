package com.znn.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.znn.provider.DemoService;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:D:/develop/myeclipsework/znn-service-consumer/WebRoot/WEB-INF/dubbo-consumer.xml");
		context.start();
		DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
	    String hello = demoService.sayHello("world"); // 执行远程方法
	    System.out.println(hello);
	}
}
