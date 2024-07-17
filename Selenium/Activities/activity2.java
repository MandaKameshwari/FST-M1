package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/login-form");
		System.out.println("The title of the page is "+ driver.getTitle());
		WebElement element= driver.findElement(By.id("username"));
		element.click();
		element.clear();
		element.sendKeys("admin");
		
		System.out.println("Username is entered");
		
		WebElement element2=driver.findElement(By.name("Password"));
		element2.click();
		element2.clear();
		element2.sendKeys("password");
		System.out.println("Password is entered");
		
		WebElement element3=driver.findElement(By.xpath("//button[text()='Log in']"));
		element3.click();
		System.out.println("Login button is clicked");
		String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
		
		driver.quit();
	}

}
