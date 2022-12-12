package TestCases;

import java.io.IOException;
import java.security.SignedObject;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.baseClass;

public class SignUpTestCase extends baseClass {

	@Test
	public void VerifySignUp() throws IOException, InterruptedException {
		
		browserInitalization();
		
		driver.get("https://login.salesforce.com/?locale=in");
			
		LoginPageObject LPO =new LoginPageObject(driver);
		
		LPO.ClickOnTryForFree().click();

	SignUpPageObject SPO = new SignUpPageObject(driver);
	Thread.sleep(2000);	
	SPO.enterFirstName().sendKeys("rame12");
	
	SPO.enterLastName().sendKeys("pande12");
	
	SPO.enterEmail().sendKeys("Serb12@");

	
	Select s =new Select(SPO.SelectJobTitle());
	
	s.selectByIndex(2);
	
	SPO.enterCompanyName().sendKeys("makino");
	
	Thread.sleep(2000);
	Select s1 =new Select(SPO.SelectEmployee());
	
	s.selectByIndex(3);
	}
	
	
	
	
	
	
}
