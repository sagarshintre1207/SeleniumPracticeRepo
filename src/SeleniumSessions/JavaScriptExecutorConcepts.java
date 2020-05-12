package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcepts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.linkText("Best Sellers")).click();
		
		//executeScript method is used to execute the Javascript code
		WebElement BestSellerlnk = driver.findElement(By.linkText("Best Sellers"));
		flash(BestSellerlnk, driver);
		
	}	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue(("backgroundcolor"));
		for (int i=0;i<=50;i++)
		{
			ChangeColor("rgb(200,0,0)", element, driver);
			ChangeColor(bgcolor, element,driver);
		}
		
		
	}

	private static void ChangeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		//js.executeScript("argument[0].style.backgroundcolor = '"+color+"'", element);`
	
	try {
		Thread.sleep(20);
	} catch (InterruptedException e) {
	}
	
	}

}
