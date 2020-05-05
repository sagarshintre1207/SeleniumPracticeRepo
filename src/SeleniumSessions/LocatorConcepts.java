package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcepts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//get the page title
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		
		//Thread.sleep(5000);
		//1. Selecting element by Name
		driver.findElement(By.name("firstname")).sendKeys("TestFirst");
		
		//Thread.sleep(5000);
		//2. Finding element by xPath
		//When xPath is relative then only use it for finding the element. If it is absolute then it is not recommended to use
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("TestLast");
		
		//Thread.sleep(5000);
		//3. Finding element by id
		driver.findElement(By.id("buttonwithclass")).click();
		
		//4. Finding element by LinkText: This is applicable only for link elements
		driver.findElement(By.linkText("Link Test")).click();
	}	

}
