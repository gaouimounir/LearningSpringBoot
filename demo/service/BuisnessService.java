package com.roadtocda.demo.service;

import org.springframework.stereotype.Component;
import com.roadtocda.demo.model.HelloWorld;

@Component
public class BuisnessService {
	
	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();
		return hw;
	}

}
