package com.sample.service;

public class SampleService {
	public String doService(String in){
		this.display("Hello World");
		System.out.println("inside doService");
		return in;
	}

	private void display(String message) {
		System.out.println(message);
		
	}
}