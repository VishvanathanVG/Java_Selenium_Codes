package Selenium_Sessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindosPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it =windowHandles.iterator();
		String parentwinid = it.next();
		System.out.println("Parent winodw id:" + parentwinid);
		
		String childwinid = it.next();
		System.out.println("Child window id:" + childwinid);
		
		driver.switchTo().window(childwinid);
		System.out.println("child wondow title:" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwinid);
		System.out.println("parent window title :" + driver.getTitle());
		
		

	}

}
