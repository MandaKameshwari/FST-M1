package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		System.out.println("The title of the page is "+driver.getTitle());
		WebElement football = driver.findElement(By.id("draggable"));
		WebElement drop1 = driver.findElement(By.id("droppable"));
		WebElement drop2 = driver.findElement(By.id("dropzone2"));
		
		builder.clickAndHold(football).moveToElement(drop1).pause(2000).release().build().perform();
		String dropzone1Verify = drop1.findElement(By.tagName("p")).getText();
        if(dropzone1Verify.equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 1");
        }

        builder.dragAndDrop(football, drop2).build().perform();
        String dropzone2Verify = drop2.findElement(By.tagName("p")).getText();
        if(dropzone2Verify.equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 2");
        }
		
		driver.close();
	}

}
