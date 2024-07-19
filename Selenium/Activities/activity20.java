package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity20 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		System.out.println("The title of the page is "+ driver.getTitle());
		// Code for accepting the prompt
		
		driver.findElement(By.id("prompt")).click();
		Alert prompAlert = driver.switchTo().alert();
		String alerttext = prompAlert.getText();
		System.out.println("The text in the prompt field is "+alerttext);
		prompAlert.sendKeys("Awesome!");
		prompAlert.accept();
		driver.close();
	
	}

}
