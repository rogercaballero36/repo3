package pages1;

import org.openqa.selenium.WebDriver;

public class HomePage1 {
		
		WebDriver driver;
		

		public HomePage1(WebDriver driver) {
			this.driver=driver;
		}
			
		public String GetTitle() {
			return driver.getTitle();
		}
			
	
}
