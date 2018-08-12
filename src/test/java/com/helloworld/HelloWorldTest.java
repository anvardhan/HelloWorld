package com.helloworld;

import org.testng.annotations.Test;

public class HelloWorldTest {
	
	@Test
	public void printHellowWorld()
	{
		String helloWorld = "Hello World!!!";
		System.out.println("Application name is-- "+helloWorld);
	}

}
