package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1. Javascript popup: Alert API to be used
		//2. File upload popup: (If type = file, then use send keys and provide the path)
		//3. Browser window popup: Use window handler API. getWindowHandles method
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//get the page title
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("testpopup");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		System.out.println(alert.getText());
		
		String alerttext = alert.getText();
		
		if (alerttext.equals("Do you really want to delete this Customer?"))
		{
			System.out.println("Correct alert text");
		}
		else
		{
			System.out.println("Incorrect alert text");
		}
	
		alert.accept(); //this method will click on OK button
		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		//String alerttext1 = alert1.getText();
		alert1.accept();
		
	}

}
