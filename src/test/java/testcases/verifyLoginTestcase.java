package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModels.loginPageObjects;
import Resources.Baseclass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class verifyLoginTestcase extends Baseclass {
	
	@Test
	public void login() throws IOException {
		
		
		
		loginPageObjects lpo=new loginPageObjects(driver);
		
		lpo.Enterusername().sendKeys(TestCaseData.username);
		lpo.Enterpassword().sendKeys(TestCaseData.password);
		lpo.EnterLogin().click();
		
		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
			
		CommonUtilities.assertionhandle(actual, expected);
		
}

}
