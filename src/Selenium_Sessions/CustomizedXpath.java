package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class CustomizedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
     	WebDriver driver =new ChromeDriver();
     	driver.get("https://www.ebay.com/");
     	driver.manage().window().maximize();
     	driver.manage().deleteAllCookies();
     	
     	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load time out
     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//all the elements available in page
     	
     	//*[@id="gh-ac"];
     	
     	//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("java");
     	
     	//Handly dynamic id
     	//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input ui-autocomplete-loading')]")).sendKeys("java");
     	//driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb ui-autocomplete-input ui-autocomplete-loading')]")).sendKeys("java");
		
     	
     	//Customized xpath for links
     	
     	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
     	
     	driver.quit();
     	
	}

}
