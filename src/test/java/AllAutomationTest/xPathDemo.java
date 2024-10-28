package AllAutomationTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xPathDemo {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/text-box");

		// Single slash “/” to validate image at start of page
		Boolean imgFlag = driver.findElement(By.xpath("/html/body/div/header/a/img")).isDisplayed();
		System.out.println("The image is displayed : " + imgFlag);

		// Double slash “//” to validate image
		Boolean img_Flag = driver.findElement(By.xpath("//img")).isDisplayed();
		System.out.println("The image is displayed (located by //) : " + img_Flag);

		// Address sign “@” full name textbox
		driver.findElement(By.xpath("//input[contains(@id, 'userN')]")).sendKeys("Full Name");

		// Dot “.” - Full name texbox
		driver.findElement(By.xpath("//input[contains(@id, 'userN')]/.")).sendKeys("Full Name");

		// Double dot “..” - Full name label
		String label = driver.findElement(By.xpath("//input[contains(@id, 'userN')]/../../div/label")).getText();
		System.out.println("The label of full text is : " + label);

		// Asterisk “*” - Full Name textbox
		driver.findElement(By.xpath("//div[contains(@id, 'userName-wrapper')]/div[2]/*")).sendKeys("Full Name");

		// Address and Asterisk “@*” - full name text box
		driver.findElement(By.xpath("//input[@*= 'userName']")).sendKeys("Full Name");

		// Pipe “|” - to locate both full name and Email label
		List<WebElement> lst = driver.findElements(By.xpath("//label[@*= 'userName-label']|//label[@*= 'userEmail-label']"));
		
		// Iterating and printing both labels
		for (WebElement e : lst) {
			System.out.println(" The label is : " + e.getText());
		}

		/*
		 * Opening web table page
		 */

		driver.get("https://www.demoqa.com/webtables");

		// Get the last node - Last val in table
		boolean lstCol = driver.findElement(By.xpath("//div[@class='rt-tr -odd']/div[last()]")).isDisplayed();
		System.out.println("The last table element is displayed : " + lstCol);

		// Get the 2 node - validate 2 position in table
		boolean positionCol = driver.findElement(By.xpath("//div[@class='rt-tr -odd']/div[position()='2']")).isDisplayed();
		System.out.println("The 2nd table element is displayed : " + positionCol);

		driver.quit();
	}

}



