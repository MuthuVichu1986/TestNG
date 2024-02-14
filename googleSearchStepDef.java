package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearchStepDef {
	
	ChromeOptions options = new ChromeOptions();
	WebDriver driver = new ChromeDriver(options);
	
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
	  driver.get("https://www.google.com");
	}
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
	   WebElement searchbox = driver.findElement(By.name("q"));
	   searchbox.sendKeys("Selenium");
	   searchbox.submit();
	}
	@Then("Should display Selenium Result Page")
	public void should_display_selenium_result_page() {
	  Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");
	  System.out.println("Succeesfully searched with word Selenium");
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
		   WebElement searchbox = driver.findElement(By.name("q"));
		   searchbox.sendKeys("Java");
		   searchbox.submit();
	}
	@Then("Should display Java Result Page")
	public void should_display_java_result_page() {

		Assert.assertEquals(driver.getTitle(), "Java - Google Search");
		System.out.println("Succeesfully searched with word Java");
	}
}
