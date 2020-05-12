package SeleniumPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException, AWTException{
		
		
		
		
		//System.setProperty("webdriver.chrome.driver","D:\\Testing Masala\\Selenium\\drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","D:\\Testing Masala\\Selenium\\drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.cloverinfotech.com/");
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,10000)"); // for scrollingDown
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("scroll(-10000,4000)");// for scrollingUp
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	            

	}


}
