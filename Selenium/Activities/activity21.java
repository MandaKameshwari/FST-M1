package activities;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity21 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/tab-opener");
		System.out.println("The title of the page is "+ driver.getTitle());
		System.out.println("The current tab is "+ driver.getWindowHandle());
		driver.findElement(By.id("launcher")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println("Currently opened window is "+driver.getWindowHandles());
		
		for(String handle : driver.getWindowHandles())
			
				{
					driver.switchTo().window(handle);
				}
		wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
		System.out.println("The current tab is "+ driver.getWindowHandle());
		System.out.println("The title of the page is "+driver.getTitle());
		String pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);
        // Find and click the button on page to open another tab
        driver.findElement(By.id("actionButton")).click();

        // Wait for new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        // Switch focus
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Wait for the new page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        // Print the handle of the current tab
        System.out.println("Current tab: " + driver.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("Page title: " + driver.getTitle());
        pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);

        // Close the browser
        driver.quit();
		
		}
		
	}

