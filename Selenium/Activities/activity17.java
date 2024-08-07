package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/selects");
		System.out.println("The Title of the page is "+driver.getTitle());
		WebElement dropdown = driver.findElement(By.id("single-select"));
		Select singleSelect = new Select(dropdown);
		singleSelect.selectByVisibleText("Option 2");
		System.out.println("The visible test for second option is "+singleSelect.getFirstSelectedOption().getText());
		singleSelect.selectByIndex(3);
		System.out.println("The third option is"+singleSelect.getFirstSelectedOption().getText());
		singleSelect.selectByValue("4");
		System.out.println("The fourth option by value is "+singleSelect.getFirstSelectedOption().getText());
		List<WebElement> allOptions = singleSelect.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }
        
        driver.close();
	}

}
