package AllAutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildWindow1 {

	  public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
			 
			WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/browser-windows");

	        // Open new window by clicking the button
	         driver.findElement(By.id("windowButton")).click();

	         // Click on the new window element and read the text displayed on the window
	         WebElement text = driver.findElement(By.id("sampleHeading"));
	   
	         // Fetching the text using method and printing it     
	         System.out.println("Element found using text: " + text.getText());
	         driver.quit();
	    }
}
