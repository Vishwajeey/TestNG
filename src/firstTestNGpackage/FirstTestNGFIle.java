package firstTestNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNGFIle {
	
	public String baseURL="http://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("Launching Google Chrome");
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(baseURL);
	  String expectedTitle="Welcome: Mercury Tours";
	  String actualTitle=driver.getTitle();
	  junit.framework.Assert.assertEquals(expectedTitle, actualTitle);
	  driver.close();
  }
}
