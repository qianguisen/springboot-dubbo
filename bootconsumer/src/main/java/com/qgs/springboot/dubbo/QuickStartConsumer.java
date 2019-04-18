package com.qgs.springboot.dubbo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

@Component
public class QuickStartConsumer {

	@Reference(interfaceClass=ServiceAPI.class)
	ServiceAPI serviceApi;
	
	public void sendMsg(String msg){
		System.out.println(serviceApi.sendMsg(msg));
	}
}
