package testcases;



import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModels.SignupPageObjects;
import PageObjectModels.loginPageObjects;
import Resources.Baseclass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifySignupTestcases extends Baseclass {

	@Test
	public void signup() throws IOException, InterruptedException {
		
		
		loginPageObjects lpo=new loginPageObjects(driver);
		lpo.signup().click();
		
		Thread.sleep(4000);
		
		String actual=driver.getTitle();
		String expected="Free CRM Trial: Salesforce 30-Day Trial - Salesforce IN";
		// this is demo line added for git changing status
		CommonUtilities.assertionhandle(actual, expected);
		
		SignupPageObjects spo =new SignupPageObjects(driver);
		
		spo.Firstname().sendKeys(TestCaseData.firstname);
	
		spo.Lastname().sendKeys(TestCaseData.lastname);
		
		spo.Workemail().sendKeys(TestCaseData.workemail);
		
		spo.Company().sendKeys(TestCaseData.company);
		
		spo.Phoneno().sendKeys(TestCaseData.phoneno);
		
		CommonUtilities.dropdownhandle(spo.Jobtitle(),1);
		CommonUtilities.dropdownhandle(spo.Selectemployee(),2);
		CommonUtilities.dropdownhandle(spo.Country(),3);
		
		
				
 }
}
