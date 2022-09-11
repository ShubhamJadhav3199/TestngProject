package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {

	
	public static void dropdownhandle(WebElement dropdownxpath,int index) {
		
		Select s=new Select(dropdownxpath);
		s.selectByIndex(index);
		
 }
	
	public static void  assertionhandle(String actual,String expected) {
		
		
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(actual, expected);
		assertion.assertAll();
		
	}
	
	
	
	
}
