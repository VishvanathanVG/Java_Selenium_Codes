package Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1 .FF driver
		//weddriver is interface
		//FirefoxDriver is class - It's implementing the webdriver interface
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Geckodriver\\geckodriver_32 bit.exe" );
     	WebDriver driver=new FirefoxDriver();//lauch ff
     	driver.get("https://www.google.com");
     	*//*driver.quit();
     	driver.close();
		*/
     	
     	
     	//2.Chrome Driver
     	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
     	WebDriver driver1 =new ChromeDriver();
     	driver1.get("https://www.google.com");
     	String title=driver1.getTitle(); //get title
     	System.out.println(title);
     	//Validation part
     	if(title.equals("Google")) {
     		
     		System.out.println("title is correct");
     	}
     		else {
     			System.out.println("title is not correct");
     		}
     
     	System.out.println(driver1.getCurrentUrl());//get current url
     	//System.out.println(driver1.getPageSource());//get page source
   
     	driver1.quit();//To quit the browser once program is executed
	
	
	
	}
	}


