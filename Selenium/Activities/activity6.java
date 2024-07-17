package activities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/input-events");
		System.out.println("The title of page is "+ driver.getTitle());
		Actions builder = new Actions(driver);
		builder.sendKeys("K").build().perform();
		builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        driver.close();
		}
	}

