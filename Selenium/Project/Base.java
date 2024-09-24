package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("http://alchemy.hguy.co/crm");
      //define implicit wait
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    }
    
    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
    
}
