package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.baseClass;

public class loginTestCase extends baseClass {

	@Test
	public void login() throws IOException {
		
		browserInitalization();
		
	driver.get("https://login.salesforce.com/?locale=in");
		
	LoginPageObject LPO =new LoginPageObject(driver);
	
	LPO.EnterUserName().sendKeys("rahul");
	
	LPO.EnterPassWord().sendKeys("resr12");
	
	LPO.ClickOnLogin().click();
	/*
	SoftAssert assertion = new SoftAssert();
	
	String Actual= 
			
	String Expected=("Please check your username and password. If you still can't log in, contact your Salesforce administrator");
	
	assertion.assertEquals(Actual,Expected);
	
	assertion.assertAll();
	}
	*/
	
	}	
}
