package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXPathConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//Absolute xpath - Not recommended to use
		//*[@id="nav-xshop"]/a[8]
		//*[@id="nav-search"]/form/div[2]/div/input
		

		//Relative Xpath
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Books");
		
		//Customize Xpath using id field
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Books");
		
		//Customise xPath using contains
		//driver.findElement(By.xpath("//input[contains(@id,'twotab']")).sendKeys("Books");
		
		//Customize XPath using class field for input element
		//driver.findElement(By.xpath("//input[@class='nav-input']")).click();
	
		//Customize xPath for links
		//all links represented by 'a' HTML tags
		//This custom xpath is only for links
		driver.findElement(By.xpath("//a[contains(text(),'AmazonBasics')]")).click();
		
		
		
	}

}




