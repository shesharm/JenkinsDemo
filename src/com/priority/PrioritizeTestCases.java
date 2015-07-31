package com.priority;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Dataprovider.DataproviderEx;

public class PrioritizeTestCases {
	
	@Test(priority=1,dataProviderClass=DataproviderEx.class,dataProvider="PriorityTestDataprovider")
	public void loginTest(String u,String p){
		System.out.println(u+"----"+p);
		Assert.assertEquals("A", "B");
		System.out.println("Login test");
	}

	@Test(priority=2,dependsOnMethods={"loginTest"})
	public void ChangePasswordTest(){
		System.out.println("Change password");
	}
	
	@Test(priority=3,dependsOnMethods={"loginTest","ChangePasswordTest"})
	public void LogOutTest(){
		System.out.println("Log out");
	}
}
