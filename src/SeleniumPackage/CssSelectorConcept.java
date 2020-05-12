package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorConcept {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","D:\\Testing Masala\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bentleymotors.com/en.html");
		
		//driver.findElement(By.className("by_mm_menu_loaded")).click();
		//driver.findElement(By.cssSelector(".by_site_nav_link.by_mm_menu_loaded")).click();
		driver.findElement(By.cssSelector("a.by_site_nav_link.by_mm_menu_loaded")).click();
		

	}

}
