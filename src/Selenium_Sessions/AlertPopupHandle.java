package Selenium_Sessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mouneesh\\eclipse-workspace\\SeleniumTraining\\JavaTrainingSession\\drivers_selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

		Thread.sleep(6000);

		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("text is correct");
		}

		else {
			System.out.println("text is incorrect'");
		}

		alt.accept(); // click on OK button in alert
		alt.dismiss();// click on cancel button in alert
	}

}
