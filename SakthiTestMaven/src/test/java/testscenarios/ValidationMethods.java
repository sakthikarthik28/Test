package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class ValidationMethods {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	
	driver = new ChromeDriver();
	//driver = new FirefoxDriver();
	//driver = new EdgeDriver();
	


	driver.get("https://www.justrechargeit.com/SignUp.aspx");
	
	Thread.sleep(3000);
	driver.manage().window().maximize();
	//verify the checkbox selection
	if (driver.findElement(By.id("checkbox1")).isSelected())
	{
	System.out.println("First Checkbox selected");
	}
	else
	{
		System.out.println("Second Checkbox NOT selected");
	}
	
	if (driver.findElement(By.id("checkbox")).isSelected())
	{
	System.out.println("Second Checkbox selected");
	}
	else
	{
		System.out.println("Second Checkbox NOT selected");
	}
	
	//verify the create account Button is enabled or disabled
	
	
	if (driver.findElement(By.id("imgbtnSubmit")).isEnabled())
	{
	System.out.println("Create account is enabled");
	}
	else
	{
		System.out.println("Create account is disabled");
	}
	
	//verify the Create new account hyperlink is displayed or not
	
	
	if (driver.findElement(By.id("signup-link9")).isDisplayed())
	{
	System.out.println("Create New account is dispalyed");
	}
	else
	{
		System.out.println("Create new account is not dispalyed");
	}
		

	}

}
