package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {

	public WebDriver driver;
	// storing xpath in by
		private By firstname=By.xpath("//input[@name='UserFirstName']");
		private By lastname=By.xpath("//input[@name='UserLastName']");
		private By workemail=By.xpath("//input[@name='UserEmail']");
		private By jobtitle=By.xpath("//select[@name='UserTitle']");
		private By company=By.xpath("//input[@name='CompanyName']");
		private By employees=By.xpath("//select[@name='CompanyEmployees']");
		private By phone=By.xpath("//input[@name='UserPhone']");
		private By country=By.xpath("//select[@name='CompanyCountry']");
		private By state=By.xpath("//select[@name='CompanyState']");
		
		public SignupPageObjects(WebDriver driver2) {
			this.driver= driver2;
		}

		public WebElement Firstname() {
			
			
			return driver.findElement(firstname);
			
		}
		
        public WebElement Lastname() {
			
			
			return driver.findElement(lastname);
			
		}
        
public WebElement Workemail() {
			
			
			return driver.findElement(workemail);
			
		}

public WebElement Jobtitle() {
	
	
	return driver.findElement(jobtitle);
	
}

public WebElement Selectemployee() {
	
	
	return driver.findElement(employees);
	
}

public WebElement Phoneno() {
	
	
	return driver.findElement(phone);
	
}

public WebElement Country() {
	
	
	return driver.findElement(country);
	
}

public WebElement Company() {
	
	
	return driver.findElement(company);
	
}	
		
public WebElement State() {
	
	
	return driver.findElement(state);
	
}	
		
		
		
}
