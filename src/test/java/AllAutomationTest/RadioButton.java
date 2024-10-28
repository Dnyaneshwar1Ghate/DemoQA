package AllAutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();

		

		/**
		 * Find radio button using ID, Validate isSelected and then click to select
		 */
		WebElement radioEle = driver.findElement(By.id("yesRadio"));
		boolean select = radioEle.isSelected();
		System.out.print(select);
		// performing click operation if element is not already selected
		if (select == false) {
			radioEle.click();
		}

		/**
		 * Find radio button using Xpath, Validate isDisplayed and click to select
		 */
		WebElement radioElem = driver.findElement(By.xpath("//div/input[@id='impressiveRadio']"));
		boolean sel = radioEle.isDisplayed();

		// performing click operation if element is displayed
		if (sel == true) {
			radioElem.click();
		}

		/**
		 * Find radio button using CSS Selector, Validate isEnabled and click to select
		 */
		WebElement radioNo = driver.findElement(By.cssSelector("input[id='noRadio']"));
		boolean selectNo = radioEle.isDisplayed();

		// performing click operation if element is enabled
		if (selectNo == true) {
			radioNo.click();
		}

	}

}
