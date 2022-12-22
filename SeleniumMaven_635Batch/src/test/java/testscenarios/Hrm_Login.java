package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrm_Login {

	public static void main(String[] args) throws Exception {
		
		//Create an object for existing class
		WebDriver driver;
		
		
//		Open Chrome browser
		 driver = new ChromeDriver();
//		type URL https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
//		Type USERNAME & Password
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");	
		
//		Click on Login button
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

}
