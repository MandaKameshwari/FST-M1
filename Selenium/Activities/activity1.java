package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://v1.training-support.net");
		System.out.println("The title of the page is " +driver.getTitle());
		WebElement element = driver.findElement(By.id("about-link"));
		element.click();
		System.out.println("The title of the new page is "+driver.getTitle());
		driver.quit();
	}

}
