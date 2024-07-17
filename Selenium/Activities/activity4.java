package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/target-practice");
		System.out.println("The title of page is "+driver.getTitle());
		String message = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("The text on third header is "+message);
		String fifthheadercolor = driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
		System.out.println(fifthheadercolor);
		String violetbuttonclasses = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
		System.out.println(violetbuttonclasses);
		String greybuttontext = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
		System.out.println(greybuttontext);
		driver.quit();
		
	
	
	}

}
