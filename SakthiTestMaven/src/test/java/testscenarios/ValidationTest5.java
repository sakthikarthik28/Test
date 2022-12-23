package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationTest5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/sakth/Downloads/QA-Selenium/QE%20-%20index.html");
		Thread.sleep(7000);
		
		// verify if the button is displayed
		
		if (driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).isDisplayed())
		{
			System.out.println("test5-button is displayed");
		}
		else
		{
			System.out.println("test5-button is not displayed");
		}
		Thread.sleep(5000);
		//click on the test 5 button
		driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).click();
		Thread.sleep(3000);
		System.out.println("you clicked a button!");
	
		//check if the button is disabled after clicking

		if (driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).isEnabled())
		{System.out.println("test5-button is enabled after clicking");
		}
		else
		{
			System.out.println("test5-button is not enabled after clicking");
		
		
		
		}
	
	}}


