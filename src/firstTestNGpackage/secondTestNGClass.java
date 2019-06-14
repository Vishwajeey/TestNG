package firstTestNGpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class secondTestNGClass {
	String baseURL="http://demo.guru99.com/test/newtours/";
	String driverPath="D:\\Selenium\\Drivers\\chromedriver.exe";
	public WebDriver driver;
  
  @BeforeTest
  public void launchBrowser() {
	  System.out.println("Launching Google Chrome...");
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver=new ChromeDriver();
	  driver.get(baseURL);
  }
  
  @Test
  public void verifyHomePageTitle() {
	  String expectedTitle="Welcome: Mercury Tours";
	  Assert.assertEquals(expectedTitle, driver.getTitle());
  }

  @AfterTest
  public void terminateBrowser() {
	  driver.close();
  }

}
