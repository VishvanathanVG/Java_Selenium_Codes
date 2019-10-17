package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
     	WebDriver driver =new ChromeDriver();
     	driver.get("https://www.spicejet.com/");
       //.switchTo().frame(0);//it will acceept only interger or String value
     	
     	driver.manage().window().maximize();
     	driver.manage().deleteAllCookies();
     	
     	Thread.sleep(6000);
     	Actions action =new Actions(driver);
     	action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
	}
		
		
	}


