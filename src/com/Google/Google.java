package com.Google;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {

	@Test
	public void Googlestart(){
		System.out.println("Google is staring");
	}
	
	@Test
	public void GoogleStop() throws Exception{
		System.out.println("Google is stopping");
		throw new SkipException("skipping google stopping");
			
	}
	
	@BeforeTest
	public void GoogleBefore(){
		System.out.println("Google is before test");
	}
	
	@BeforeMethod
	public void GoogleBeforeMethod(){
		System.out.println("Google is before Method");
	}
	
	@BeforeClass
	public void GoogleBeforeClass(){
		System.out.println("Google is before Class");
	}
	
	@BeforeSuite
	public void GoogleBeforeSuite(){
		System.out.println("Google is before Suite");
	}
}
