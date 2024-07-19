package activities;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity18 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/selects");
		System.out.println("The title of the page is "+driver.getTitle());
		WebElement selectWebElement = driver.findElement(By.id("multi-select"));
		Select multiSelect = new Select(selectWebElement);
		multiSelect.selectByVisibleText("Javascript");
			for(int i=4;i<=6;i++)
					{
						multiSelect.selectByIndex(i);
					}
		multiSelect.selectByValue("node");
		List<WebElement> SelectedOptions = multiSelect.getAllSelectedOptions();
		System.out.println("The selected options are :");
		
			for(WebElement option: SelectedOptions)
					{
						System.out.println(option.getText());
						
					}
		multiSelect.deselectByIndex(5);
		
		SelectedOptions = multiSelect.getAllSelectedOptions();
		System.out.println("The selected options are :");
		
			for(WebElement option: SelectedOptions)
					{
						System.out.println(option.getText());
						
					}
		driver.close();
	}

}
