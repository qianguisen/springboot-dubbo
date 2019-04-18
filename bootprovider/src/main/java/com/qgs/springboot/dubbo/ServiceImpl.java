package com.qgs.springboot.dubbo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service(interfaceClass=ServiceAPI.class)
public class ServiceImpl implements ServiceAPI{

	public String sendMsg(String msg) {
		System.out.println("bootprovider recv:" + msg);
		return "bootprovider recv:" + msg;
	}

}
