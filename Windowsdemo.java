package Handson;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
	    
	    driver.get("https://demoqa.com/browser-windows");
	    driver.manage().window().maximize();
	    WebElement newtab = driver.findElement(By.xpath("//button[@id='tabButton']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;  
	    js.executeScript("arguments[0].scrollIntoView();", newtab);
	    newtab.click();
	    
//	    String handles = driver.getWindowHandle();
	    Set<String> windowhandles = driver.getWindowHandles();
	    windowhandles.size();
	    
	    for(String windowhandle : windowhandles) {
	    	driver.switchTo().window(windowhandle);
	    }
	    WebElement newWindowtab = driver.findElement(By.id("sampleHeading"));
	    System.out.println("Text message is : " + newWindowtab.getText());
	    
	    driver.close();
	    driver.switchTo().window(windowhandles.iterator().next());
	    
	     
	}

}
