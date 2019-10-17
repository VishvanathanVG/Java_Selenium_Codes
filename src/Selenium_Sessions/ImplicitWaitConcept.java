package Selenium_Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//it is Dynamic wait
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
     	WebDriver driver =new ChromeDriver();
     	driver.get("https://www.spicejet.com/");
     	
     	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load time out
     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//all the elements available in page
     	

		
		
	}

}
