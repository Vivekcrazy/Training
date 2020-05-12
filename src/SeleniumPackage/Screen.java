package SeleniumPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {

	public static void main(String[] args) throws IOException 
	{
		String fileName="SampleReport";
		//String filaNam="DemoReport";
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","D:\\Testing Masala\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumTraining\\Screenshots\\"+fileName+".png"));
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vivek");
		TakesScreenshot t = (TakesScreenshot)driver;
		File sourc =ts.getScreenshotAs(OutputType.FILE);
		String fileNam="DemoReport";
		FileUtils.copyFile(sourc,new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumTraining\\Screenshots\\"+fileNam+".png"));

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("singh");
		
		
		driver.close();
	
		
		

	}

}
