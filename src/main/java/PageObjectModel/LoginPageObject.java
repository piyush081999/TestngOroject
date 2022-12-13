package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	// this is my demo line  for github 
	
	public WebDriver driver;//this driver dont have scope 
	
	 private By UserName = By.xpath("//input[@id='username']");
	
	private By PassWord =By.xpath("//input[@id='password']");
	
	 private By Login = By.xpath("//input[@id='Login']");
	
	 private By TryForFree =By.xpath("//a[@id='signup_link']");
	 
	private By HandelError =By.xpath("//div[@id='error']");
	 
	 //dddddd
	public LoginPageObject(WebDriver driver2) {
	this.driver =driver2;
	}

	//fffff
	public WebElement EnterUserName() {
		
		return driver.findElement(UserName);
		
		
	}
      public WebElement EnterPassWord() {
		
		return driver.findElement(PassWord);
		
		
	}	
	
      public WebElement ClickOnLogin() {
  		
  		return driver.findElement(Login);
  		
  		
  	}
      
      
	public WebElement ClickOnTryForFree () {
		
		return driver.findElement(TryForFree);
		
		
	}

	public WebElement HandelError () {
		
		return driver.findElement(HandelError);
	}
	
	
	
}
