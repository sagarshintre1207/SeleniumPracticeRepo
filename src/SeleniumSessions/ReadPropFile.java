package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		//Created object of properties class
		Properties prop = new Properties();
		
		//Create object of FileInoutStream class with location of config.properties file
		//Role of fileinputstream class is to connect to properties file
		FileInputStream ip = new FileInputStream ("C:\\Sagar\\Java\\SeleniumPractice\\src\\SeleniumSessions\\config.properties");
		
		//This will load the properties using load method
		prop.load(ip);
		
		//Use getProperty method to pass the key of property
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		//This will result in NULL as "Name" property is not present in the property file
		System.out.println(prop.getProperty("Name"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browsername = prop.getProperty("Browser");
		System.out.println(browsername);
		
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Sagar\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); //launch chrome
		}
		else if (browsername.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Sagar\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(); //launch firefox
		}
		else if (browsername.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Sagar\\Drivers\\C:\\Sagar\\Drivers\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(); //launch IE
		}
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("EmailAddress_xpath"))).sendKeys(prop.getProperty("EmailAddress"));
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		driver.quit();
		
	}

}
