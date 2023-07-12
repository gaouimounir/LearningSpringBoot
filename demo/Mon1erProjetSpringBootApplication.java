package com.roadtocda.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roadtocda.demo.model.HelloWorld;
import com.roadtocda.demo.service.BuisnessService;

@SpringBootApplication
public class Mon1erProjetSpringBootApplication implements CommandLineRunner {
	
	@Autowired
	private BuisnessService bs;
	
	public static void main(String[] args) {
		SpringApplication.run(Mon1erProjetSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
		
	}

}
