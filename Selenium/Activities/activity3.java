package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/login-form");
		System.out.println("The title of the page is "+ driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id ='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
		String message = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("The login messgae is "+message);
		driver.quit();
		

	}

}
