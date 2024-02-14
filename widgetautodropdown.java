package Handson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class widgetautodropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
	    
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("src")).sendKeys("Chennai");
	    WebElement from= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]")));
	    from.click();
	    
	    driver.findElement(By.id("dest")).sendKeys("Bangalore");
	    WebElement to= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]")));
	    to.click();
	  
	    driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div/span")).click();
	    
	}

}
