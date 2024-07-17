package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity15 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
		System.out.println("The title of the page is "+driver.getTitle());
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@class,'username-')]"));
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));
		username.sendKeys("admin");
		password.sendKeys("password");
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
		String Loginmessage = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("The login messgae is "+Loginmessage);
		driver.close();
	
	}

}
