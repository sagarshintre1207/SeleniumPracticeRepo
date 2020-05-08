package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Target
		//1. Get the total count of links on the page
		//2. Get the text of each link
		
		//All the links are represented by <a> html tag 
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		//size of links: counts of links
		System.out.println("Total links on Amazon website is:"+linklist.size());
		
		//Text of links
		for (int i=0;i<linklist.size();i++) {
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
		}
		
		System.out.println("**************************************************************************");
		
		
		List<WebElement> inputfields = driver.findElements(By.tagName("input"));
		System.out.println(inputfields.size());
		
		for (int j=0;j<inputfields.size();j++) {
			String inputtext = inputfields.get(j).getText();
			System.out.println(inputtext);
		}
		
		driver.quit();
		
	}

}
