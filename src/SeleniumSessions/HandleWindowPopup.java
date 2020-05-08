package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		//1. Javascript popup: Alert API to be used
		//2. File upload popup: (If type = file, then use send keys and provide the path)
		//3. Browser window popup: Use window handler API. getWindowHandles method

		
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://popuptest.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Channel Opener')]")).click();
		
		Thread.sleep(2000);
		
		//Use setobject to get the window id
		Set<String> handler = driver.getWindowHandles(); //Setobject is not ArrayList or LinkedList
		
		Iterator<String> it = handler.iterator();//use Iterator to move the focus on Parent and child windows
		
		//Get the parent window id
		String parentWindowID = it.next();
		System.out.println("Parent window id:"+parentWindowID);
		
		
		//Get the child window id
		String childWindowID = it.next();
		System.out.println("Child window id:"+childWindowID);
		
		//Switch to child window
		
		driver.switchTo().window(childWindowID);
		Thread.sleep(2000);
		System.out.println("Child window popup title"+driver.getTitle());
		driver.close();
		
		//Switch to parent window
		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		System.out.println("Parent window title"+driver.getTitle());

	}

}
