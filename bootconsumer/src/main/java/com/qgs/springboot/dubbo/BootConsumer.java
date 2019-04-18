package com.qgs.springboot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class BootConsumer {

	public static void main(String args[]){
		ConfigurableApplicationContext context = SpringApplication.run(BootConsumer.class, args);
		
		QuickStartConsumer quickStartConsumer = (QuickStartConsumer) context.getBean("quickStartConsumer");
		quickStartConsumer.sendMsg("test boot dubbo!");
	}
}
