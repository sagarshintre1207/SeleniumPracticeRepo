package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Javascript popup: Alert API to be used
		//2. File upload popup: (If type = file, then use send keys and provide the path)
		//3. Browser window popup: Use window handler API. getWindowHandles method
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//get the page title
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		//To upload the file do not use the ".click" method, instead use .sendKeys method
		//type = file should be present to uplaod the file to be worked
		driver.findElement(By.xpath("//*[@id=\"photo\"]")).sendKeys("C:\\Sagar\\FileUploadPractice\\File1.txt");
		

	}

}
