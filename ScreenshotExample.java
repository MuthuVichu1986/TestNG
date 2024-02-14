package Handson;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotExample {
	
	@Test
	public void screenshotExample() {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
	    
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    WebElement searchbox = driver.findElement(By.name("q"));
	    
	    //Screenshot.captureScreenshot(driver, screenshotExample)
	    
	    File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try { 
	    	FileUtils.copyFile(file, new File("google.png"));
	    }catch (IOException e) {
	    	e.printStackTrace();
	    }
	}

}
