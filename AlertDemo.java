package Handson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	    Alert alert = driver.switchTo().alert();
	    System.out.println("Alert message is : " + alert.getText());
	    alert.accept();
	    System.out.println("Alert with OK Done Successfully");
	    
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    Alert alertwithcancel = driver.switchTo().alert();
	    System.out.println("Alert message is : " + alertwithcancel.getText());
	    Thread.sleep(2000);
	    alertwithcancel.accept();
	    System.out.println("Alert with OK is Done Successfully");
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    alertwithcancel.dismiss();
	    System.out.println("Alert with cancel is Done Successfully");
	    
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Alert with Textbox")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
//	    Alert alertwithtextbox = driver.switchTo().alert();
//	    System.out.println("Alert message is : " + alertwithtextbox.getText());
//	    alertwithtextbox.accept();
//	    alertwithtextbox.sendKeys("My name is Kamal");
//	    System.out.println("Alert with textbox is Done Successfully");
	    Thread.sleep(5000);
	    driver.switchTo().alert().sendKeys("My name is Kamal");
	    Thread.sleep(5000);
	    driver.switchTo().alert().accept();
	    
	}

}