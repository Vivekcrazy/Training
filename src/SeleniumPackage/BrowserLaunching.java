package SeleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserLaunching  
{

	public static void main(String[] args) {
		
	       
		System.setProperty("webdriver.chrome.driver","D:\\Testing Masala\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen(); //F12
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); // dynamic wait
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS); // dynamic wait
		
		driver.get("https://www.facebook.com");
		
		WebDriverWait wait = new WebDriverWait(driver,1); // WebDriverWait is class
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("vivek");
		
		WebDriverWait wait2 = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.urlContains("qq"));
		
        // The explicit wait is used to tell the Web Driver to wait maximum for certain expected conditions before throwing error
        // We can set different timeout time for different element 
		
		
		
	
	}
	}
		
		
		
		
	
		
		
		
		
	
		
		
		
		
		

		
		

		
		
		
		

		
		
		
		
		

		
	


