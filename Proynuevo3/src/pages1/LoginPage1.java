package pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage1 {
	 
	WebDriver driver;
	
	By txtusername = By.name("uid");
	By txtpassword = By.name("password");
	By buttomLogin = By.name("btnLogin");

	
	public LoginPage1(WebDriver driver) {
		this.driver=driver;
	}

	public void setTxtUser(String username) {
		WebElement txtUser = driver.findElement(txtusername);
		txtUser.sendKeys(username);
	}
	
	public void setPassword(String password) {
		WebElement txtPass = driver.findElement(txtpassword);
		txtPass.sendKeys(password);
	}
	
	public void clickLoginButtom() {
		WebElement btnLogin = driver.findElement(buttomLogin);
		btnLogin.click();
	}

	public void loginIntoThePage(String user, String pass) {
		setTxtUser(user);
		setPassword(pass);
		clickLoginButtom();
	}
	
}