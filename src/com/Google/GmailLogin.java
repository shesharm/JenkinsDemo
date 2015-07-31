package com.Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Dataprovider.DataproviderEx;

public class GmailLogin {
	
	@Test(dataProviderClass= DataproviderEx.class, dataProvider="regTestDataprovider")
	public void Login(String username,String password){
		System.out.println(username +"=== "+password);
/*		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\gmail.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Gmail");
		Assert.assertEquals(title, "yahoo");*/
	}
	
	
		
}
