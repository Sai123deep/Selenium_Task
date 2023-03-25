package tpack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Taking_screenshots {

	public static void main(String []args) throws IOException
	{
	 WebDriverManager.edgedriver().setup();
    WebDriver driver =new EdgeDriver();
    driver.get("http://omayo.blogspot.com/");
    driver.manage().window().maximize();
    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
  //Take a Screenshot here
  		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  		FileUtils.copyFile(src, new File("screenshots//screenshot1.png"));
  		
  	driver.quit();
	}
		
	}


