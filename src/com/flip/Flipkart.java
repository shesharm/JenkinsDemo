package com.flip;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Flipkart {
	
	
  @Test
  public void f() {
	  
	  System.out.println("Running flipkart");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("running flipkart before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("running flipkart after test");
  }

}
