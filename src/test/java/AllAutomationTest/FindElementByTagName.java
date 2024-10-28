package AllAutomationTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByTagName {
	   public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
			 
			WebDriver driver = new FirefoxDriver();

		   driver.get("https://demoqa.com/text-box/");
			
		   // Find elements using tag name
		   List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
			
		   if(allInputElements.size() != 0) 
		   {
			   System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
				
			   for(WebElement inputElement : allInputElements) 
			   {
				   System.out.println(inputElement.getAttribute("placeholder"));
			   }
		   }
	   }
	}
