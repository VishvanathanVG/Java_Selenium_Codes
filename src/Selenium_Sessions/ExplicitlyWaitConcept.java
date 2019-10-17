package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
     	WebDriver driver =new ChromeDriver();
     	driver.get("https://www.facebook.com/");
     	driver.manage().window().maximize();
     	driver.manage().deleteAllCookies();
     	
     	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load time out
     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//all the elements available in page
     	
        clickOn(driver, driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")), 20); 
        
        driver.quit();


	}

	
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}
	
}




