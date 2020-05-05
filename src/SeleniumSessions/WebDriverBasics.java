package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Launch firefox browser
		//geckodriver is a class and we need to create a object of geckodriver class
		//Create object of FF driver class
		//System.setProperty("webdriver.gecko.driver", "C:\\Sagar\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https:\\www.google.com");
		
		//2. Launch Chrome Browser
		//Create object of Chrome driver class
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//get the page title
		driver.get("https:\\www.google.com");
		String title = driver.getTitle(); 
		System.out.println(title);
		
		// Validation point
		if (title.equals("Google")) 
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is not correct");
		}
		
		System.out.println(driver.getCurrentUrl()); //to get current URL of the page
		//System.out.println(driver.getPageSource()); //to get the page source
		
		driver.quit();
	}

}
