package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {
	public WebDriver driver;
// storing xpath in by
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By LoginButton=By.xpath("//input[@id='Login']");
	private By Tryforfree=By.xpath("//a[@id='signup_link']");
	
	public loginPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement Enterusername() {
		
		
		return driver.findElement(username);
		
	}
	
public WebElement Enterpassword() {
		
		
		return driver.findElement(password);
		
	}
	
public WebElement EnterLogin() {
	
	
	return driver.findElement(LoginButton);
	
}
	
public WebElement signup() {
	
	
	return driver.findElement(Tryforfree);
	
}


}
