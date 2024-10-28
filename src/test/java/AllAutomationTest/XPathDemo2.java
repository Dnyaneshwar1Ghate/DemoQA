package AllAutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathDemo2 {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		//Using contains() to locate full name and enter data
		driver.findElement(By.xpath("//input[contains(@id, 'userN')]")).sendKeys("User Name");

		//using placeholder
		driver.findElement(By.xpath("//input[contains(@placeholder, 'example')]")).sendKeys("Using Placeholder");
		
		//using start-with() 
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Fu')]")).sendKeys("Using start with");
		
		//using text() to get label
		String text = driver.findElement(By.xpath("//label[text()='Email']")).getText();
		System.out.println(text);
		
		//using AND operator to locate full name
		driver.findElement(By.xpath("//input[@placeholder ='Full Name' and @type = 'text']")).sendKeys("AND operator");
		
		//using OR operator to locate full name
		driver.findElement(By.xpath("//input[@placeholder ='Full Name' or @type = 'text']")).sendKeys("OR operator");
		
		//using ancestor to locate form tag
		boolean bol =driver.findElement(By.xpath("//label[text()='Full Name']/ancestor::form")).isDisplayed();
		System.out.println("Form is displayed : "+bol);
		
		//using child to locate full name textbox from form
		String label = driver.findElement(By.xpath("//form[@id='userForm']/child::div[1]//label")).getText();
		System.out.println("The label text is : "+ label);
		
		
		//using decendent axis to locate yes radio
		driver.get("https://www.demoqa.com/radio-button");
		driver.findElement(By.xpath("//div[@class= 'custom-control custom-radio custom-control-inline']/descendant::input/following-sibling::label")).click();
		
		//using parent axis to locate yes radio
		boolean bo = driver.findElement(By.xpath("//input[@id='yesRadio']/parent::div")).isSelected();
		System.out.println("The Yes radio is selected : "+bo);
		
		//using following axis to locate current address
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id=\"userName\"]/following::textarea")).sendKeys("Text Area locate following");
		
		//using following-sibling to locate email 
		driver.findElement(By.xpath("(//div[@class='col-md-3 col-sm-12']/following-sibling::div/input)[2]")).sendKeys("abc@xyz.com");
		
		//using preceding-axis to locate full name
		String preceding = driver.findElement(By.xpath("//input[@id='userName']/preceding::label")).getText();
		System.out.println("The value of preceding : "+preceding);
		}

	

}
