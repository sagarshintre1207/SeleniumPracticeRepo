package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//Element finding using dynamic xpath
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		//driver.findElement(By.name("email")).sendKeys("sagarshintrewb@gmail.com");
		//Thread.sleep(2000);
		
		//Element finding using Dynamic xpath 
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sagarshintrewb@gmail.com");
		
		//Element finding using Dynamic xpath 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sagar@1573");
		
		//Element finding using dymanic xpath
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		//Thread.sleep(2000);
		
		//Element finding with dynamic xpath
		driver.findElement(By.xpath("//a[@class='item' and @href='/contacts']")).click();
		
		driver.findElement(By.xpath("//div[@role='listbox']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='menu transition visible']//a"));
		System.out.println(list.size());
		Thread.sleep(2000);
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("Log Out")) {
				list.get(i).click();
			}
		}
		//*[@id="main-nav"]/a[3]/span

	}

}
