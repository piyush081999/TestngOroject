package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {

	public WebDriver driver;
	
	By FirstName = By.xpath("//input[@name='UserFirstName']");
	
	By LastName =By.xpath("//input[@name='UserLastName']");
	
	By Email =By.xpath("//input[@name='UserEmail']");
	
	By SelectJobTitle =By.xpath("//select[@name='UserTitle']");
	
	By CompanyName =By.xpath("//input[@name='CompanyName']");
	
	By SelectEmployee =By.xpath("//select[@name='CompanyEmployees']");
	
	
	public SignUpPageObject(WebDriver driver2) {
		
		this.driver =driver2;
	}

	public WebElement  enterFirstName() {
		
		return driver.findElement(FirstName);
	}
	
public WebElement  enterLastName() {
		
		return driver.findElement(LastName);
	}

public WebElement  enterEmail() {
	
	return driver.findElement(Email);
}
	
public WebElement SelectJobTitle () {
	
	return driver.findElement(SelectJobTitle);


}

public WebElement enterCompanyName() {
	
	return driver.findElement(CompanyName);
}


public WebElement SelectEmployee () {
	
	return driver.findElement(SelectEmployee);
}





}
