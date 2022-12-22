package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationMethodsSample {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		Thread.sleep(3000);
		//Verify the Create New Account hyper link is displayed or not?
		if (driver.findElement(By.id("signup-link9")).isDisplayed()) {
			System.out.println("Create New Account hyper link is displayed");
		} else {
			System.out.println("Create New Account hyper link is NOT displayed");
		}
		
		System.out.println("****************************");
		
		//Verify two check boxes, which one is default selected?
		if (driver.findElement(By.id("checkbox1")).isSelected()) {
			System.out.println("First checkbox has selected by default");
		} else {
			System.out.println("First checkbox has NOT selected by default");
		}
		
		System.out.println("****************************");
		
		if (driver.findElement(By.id("checkbox")).isSelected()) {
			System.out.println("Second checkbox has selected by default");
		} else {
			System.out.println("Second checkbox has NOT selected by default");
		}
		System.out.println("****************************");

		//Create account button is enabled state or not?			
		if (driver.findElement(By.id("imgbtnSubmit")).isEnabled()) {
			System.out.println("Given locator is Enabled state");
		} else {
			System.out.println("Given locator is NOT Enabled state");
		}
	}

}
