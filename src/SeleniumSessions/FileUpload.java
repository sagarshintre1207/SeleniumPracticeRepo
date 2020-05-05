package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//get the page title
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		//To upload the file do not use the ".click" method, instead use .sendKeys method
		driver.findElement(By.xpath("//*[@id=\"photo\"]")).sendKeys("C:\\Sagar\\FileUploadPractice\\File1.txt");
		

	}

}
