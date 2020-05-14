package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionConcept {
	
	WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		FunctionConcept obj = new FunctionConcept();
		obj.invokebrowser();
		obj.login();
		obj.contactpage();
		obj.logout();
}
	
	public void invokebrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

	public void login() {
		
		//Element finding using dynamic xpath
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sagarshintrewb@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sagar@1573");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}
	
	public void contactpage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='item' and @href='/contacts']")).click();
		String curl = driver.getCurrentUrl();
		if (curl.equals("https://ui.freecrm.com/contacts"))
		{
			System.out.println("User is on contact page");
		}
	}
	
	public void logout() throws InterruptedException
    {
		driver.findElement(By.xpath("//div[@role='listbox']")).click();
		//menuclk.click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='menu transition visible']//a"));
		System.out.println(list.size());
		Thread.sleep(2000);
		for (int i=0;i<list.size();i++)
		{
			//System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("Log Out")) 
			{
				list.get(i).click();
			}
		}
		
    }
    

}
