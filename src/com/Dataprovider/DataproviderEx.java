package com.Dataprovider;

import org.testng.annotations.DataProvider;

public class DataproviderEx {

	
	@DataProvider(name="regTestDataprovider")
	public static Object[][] getData(){
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Sharma@gmail.com";
		data[0][1] = "Pass@1";
		
		data[1][0] = "Shekhar@gmail.com";
		 data[1][1] = "Pass@2";
		 
		 return data;
	}

	@DataProvider(name="PriorityTestDataprovider")
	public static Object[][] PrioritygetData(){
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "U1";
		data[0][1] = "P1";
		
		data[1][0] = "U2";
		 data[1][1] = "P2";
		 
		 return data;
	}
}
