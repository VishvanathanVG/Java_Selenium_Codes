package Selenium_Sessions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class TakeScreenShotConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
     	WebDriver driver =new ChromeDriver();
     	driver.get("https://www.facebook.com/");
     	driver.manage().window().maximize();
     	driver.manage().deleteAllCookies();
     	
     	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // Page load time out
     	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//all the elements available in page

     	//to take screenshot of any screen 
     	File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     	//FileUtils.copyFile(src, new File("C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\src\\Selenium_Sessions\\facebook.png"));
		
     	
	}

}
