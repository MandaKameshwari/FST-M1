package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/input-events");
		System.out.println("The title of the page is "+driver.getTitle());
		
		Actions builder = new Actions(driver);
		
		builder.click().pause(2000).build().perform();
		String frontext = driver.findElement(By.className("active")).getText();
		System.out.println(frontext);
		
		builder.doubleClick().pause(2000).build().perform();
		String randomside = driver.findElement(By.className("active")).getText();
		System.out.println(randomside);
		
		builder.doubleClick().pause(2000).build().perform();
		String rightclick = driver.findElement(By.className("active")).getText();
		System.out.println(rightclick);
		
		driver.close();

	}

}
