package Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
     	WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        
        driver.navigate().to("https://www.rediff.com");
        System.out.println(driver.getTitle());
        
        driver.navigate().back();
        System.out.println(driver.getTitle());
        
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        
        driver.navigate().back();
        System.out.println(driver.getTitle());
		
        driver.navigate().refresh();//refresh the page
        System.out.println(driver.getTitle());
	}

}
