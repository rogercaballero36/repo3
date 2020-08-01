package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages1.*;

public class LoginTest1 {
	
	String driverPath = "C:\\Users\\rcaballa\\Documents\\Pruebawendy\\chrone\\chromedriver.exe";
	String url = "http://demo.guru99.com/Agile_Project/Agi_V1/index.php";
	WebDriver driver;
	
	LoginPage1 objLogin;
	HomePage1 objHome;
	
	@BeforeTest
	  public void setUp() {
		  
		  System.setProperty("webdriver.chrome.driver",driverPath);
		  driver = new ChromeDriver();
		  
	  }
	
	@AfterTest
	  public void closeBrowser() {
			driver.quit();
	}
		 
  @Test
  public void login() {
	  objLogin = new LoginPage1 (driver);
	  objHome = new HomePage1(driver);
	  
	  driver.get(url);
	  objLogin.loginIntoThePage("1303", "Guru99");
	  Assert.assertEquals("Guru99 Bank Home Page", objHome.GetTitle());
	  
  }
}