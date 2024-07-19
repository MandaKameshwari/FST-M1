package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity19 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		System.out.println("The title of the page is "+ driver.getTitle());
		
		// Code to accept the message
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlertA = driver.switchTo().alert();
		String confirmalerttextA = confirmAlertA.getText();
		System.out.println("The text in the confirm alert is "+confirmalerttextA);
		confirmAlertA.accept();
		
		// code to cancel the message
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlertD = driver.switchTo().alert();
		String confirmalerttextD = confirmAlertD.getText();
		System.out.println("The text in the confirm alert is "+confirmalerttextD);
		confirmAlertD.dismiss();
		
		driver.close();
	
	}

}
