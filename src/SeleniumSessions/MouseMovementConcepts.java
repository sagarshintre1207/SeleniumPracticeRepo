package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcepts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//get the page title
		driver.get("https://public.websteronline.com/personal");
		driver.manage().window().maximize();
		
		//Mouse movement will be done by actions class
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Bank"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Checking Accounts")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Personal Checking Accounts | Open a Checking Account Today | Webster Bank")) 
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is not correct");
		}
		
		//driver.quit();
	}

}
