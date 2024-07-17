package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity16 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
		System.out.println("The title of page is "+ driver.getTitle());
		WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
		userName.sendKeys("FirstUser");
		password.sendKeys("FirstUser");
		confirmPassword.sendKeys("FirstUser");
		email.sendKeys("FirstUser@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		
		String ConfirmationMessage = driver.findElement(By.xpath("//div[contains(text(),'Thank you for registering')]")).getText();
		System.out.println("The Welcome text is "+ConfirmationMessage);
		driver.close();

	}

}
