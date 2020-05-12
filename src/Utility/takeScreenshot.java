package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takeScreenshot 
{
	public static void capturescreenshot(WebDriver driver,String fileName) throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumTraining\\Screenshots\\"+fileName+".png"));
	}

}
