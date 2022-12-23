package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationTest4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/sakth/Downloads/QA-Selenium/QE%20-%20index.html");
		
		//verify the Test 4 first  button is enabled 
		
		
		if(driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]")).isEnabled())
		{
		System.out.println("First button should be Enabled");
		}
		else
		{
			System.out.println("First button should be disabled");
		}
		
		if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[2]")).isEnabled())
		{
		System.out.println("Second button is Enabled");
		}
		else
		{
			System.out.println("Second button is not Enabled");
	}}
}

