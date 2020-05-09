package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Launch browser
		
		
		//htmluitdriver is not available with selenium 3.x version
		//htmlunitdriver --- to use this concept, we have to download the htmlunitdriver jar file and import the same in to the project
		//Not suitable for for Actions class--user actions--mousemovement, doubleclick, drag and drop
		//It is also called headless browser or Ghost Driver
		//--HTML Driver --- For Java
		//--PhantomJS --- For Javascript
		
		
		//advantages
		//1. Testing will happen behind the scene. No browser will be launched
		//2. Execution of test cases will be fast
		//3. Performance of test execution will be increased
		
		
		//WebDriver driver = new HtmlUnitDriver();
		
		
		
		driver.manage().window().maximize(); //Maximise window
		driver.manage().deleteAllCookies(); //delete cookies
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com"); //Entering URL
		
		System.out.println("Before Login Title is"+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sagarshintrewb@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sagar@1573");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		System.out.println("After Login Title is"+driver.getTitle());
		
	}

}
