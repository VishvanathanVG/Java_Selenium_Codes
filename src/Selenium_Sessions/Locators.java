package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Selenium interacts with locators to all the elements
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
		
		//different types of Locators
		
		//1. By Id -unique locators
		WebElement username=driver.findElement(By.id("login-username"));
		username.sendKeys("vishva");
		Thread.sleep(2000);
		WebElement submit =driver.findElement(By.id("login-signin"));
		submit.click();
		
		
		
		//2.By name - unique locators
		
		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys("vishva");
		
		//3.By Xpath
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("vishva");
		
		
		//4.Css Selector
		
	    driver.findElement(By.cssSelector("#login-username")).sendKeys("vishva");
		
		
		//5.Linktext //only for links
		
		driver.findElement(By.linkText("Difficulty signing in?")).click();
		
		//6.Partial link text //only for links not recommended
		
		driver.findElement(By.partialLinkText("Difficulty")).click();
		
		//7.Classname - it is not unique value - Not recommended 
		driver.findElement(By.className("phone-no")).sendKeys("vishva");
	}

}
