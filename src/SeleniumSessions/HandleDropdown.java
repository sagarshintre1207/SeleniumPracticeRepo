package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch the URL in browser
		driver.get("https://demoqa.com/automation-practice-form/");
		
		//handling the dropbox. Create a object of select class
		Select select = new Select(driver.findElement(By.id("continents")));
		select.selectByVisibleText("North America");
			
		
		
	}

}
