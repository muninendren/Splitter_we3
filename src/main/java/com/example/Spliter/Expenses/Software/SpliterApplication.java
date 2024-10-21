package com.example.Spliter.Expenses.Software;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpliterApplication {

	public static void main(String[] args) {
		SpliterApplication obj=new SpliterApplication();
		SpringApplication.run(SpliterApplication.class, args);
		obj.ret();

	}
	private String ret(){
		return "heloooo";
	}

}
