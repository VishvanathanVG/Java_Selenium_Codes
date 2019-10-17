package Selenium_Sessions;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\src\\Selenium_Sessions\\configure.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.setProperty("webdriver.chrome.driver", "./drivers_selenium/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath(prop.getProperty("username_xpath")).sendKeys(prop.getProperty("userName"));
		driver.findElementByXPath(prop.getProperty("password_xpath")).sendKeys(prop.getProperty("passWord"));
		driver.findElementByXPath(prop.getProperty("login_xpath")).click();
	}

}
