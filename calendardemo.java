package Handson;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendardemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
	    
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    driver.get("https://demo.automationtesting.in/Datepicker.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a[test()=22]")).click();
	    
	}


}
