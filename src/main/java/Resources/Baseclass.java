package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	public WebDriver driver;
	public  Properties prop;
public WebDriver browserLaunch() throws IOException  {

	  //This will help us to read data.properties file
	 // FileInputStream fis=new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\20juntestngFramework\\src\\main\\java\\Resources\\Data.properties");
 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");// for sharing with others & also for using others projects
	  // This will access the data.properties
	   prop=new Properties();
	  
	  prop.load(fis);
	  
	  String browserName =prop.getProperty("browser");
	  
	  if(browserName.equalsIgnoreCase("chrome") ) {
	 
		 // System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\shubham\\user1\\chrome driver\\chromedriver.exe");
			// WebDriverManager.chromedriver().versionsPropertiesUrl(null).setup(); for specific chrome driver
		  WebDriverManager.chromedriver().setup();//for updated chrome driver
		  driver =new ChromeDriver();
	   
	  }else if(browserName.equalsIgnoreCase("firefox")) {
	   
	   //FireFox code
	  }
	         else if(browserName.equalsIgnoreCase("Edge")) {
	   
	   //edge code
	  }
	         else {
	          System.out.println("please select valid browser");
	         }
	  
	  return driver;
	  
	 }


       @BeforeMethod
       public void launchbrowser() throws IOException {
    	   
    	   browserLaunch();
   		
   		driver.get(prop.getProperty("url"));
   		
       }

       
       @AfterMethod
       public void teardown() throws IOException {
    	   
    	  driver.quit();
       }


	}

	
	
	


	
		  
		  