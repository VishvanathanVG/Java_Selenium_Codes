package Selenium_Sessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
     	WebDriver driver =new ChromeDriver();
     	driver.get("https://www.facebook.com/");
     	driver.manage().window().maximize();
     	driver.manage().deleteAllCookies();
     	
     	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load time out
     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//all the elements available in page

       List<WebElement> linklist=driver.findElements(By.tagName("a"));
       
       //Get to size of the link - it is normal array list.
       
       System.out.println(linklist.size());
       
       //To Know the each link text
       
       for(int i=0;i<linklist.size();i++) {
    	   String linkname =linklist.get(i).getText();
    	   System.out.println(linkname);
       }
     	
       driver.quit();
		
	}

}
