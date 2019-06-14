package firstTestNGpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ThirdTestNGFIle {
	String baseURL="http://demo.guru99.com/test/newtours/";
	WebDriver driver=null;
	String driverPath="D:\\Selenium\\Drivers\\chromedriver.exe";
	
	@BeforeTest
	public void launnchBrowser() {
		System.out.println("Launching Browser...");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver =new ChromeDriver();
		driver.get(baseURL);
	}

	@BeforeMethod
	public void verifyHomePageTitle() {
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}

	@Test(priority=0)
	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		Assert.assertEquals("Register: Mercury Tours", driver.getTitle());
	}
	
	@Test(priority=1)
	public void support() {
		driver.findElement(By.linkText("SUPPORT")).click();
		Assert.assertEquals("Under Construction: Mercury Tours", driver.getTitle());
	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
