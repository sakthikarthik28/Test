package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login {

	public static void main(String[] args) {
		// Create an webdriver object
		WebDriver driver;
		
		//Browser open
		driver = new ChromeDriver();
		
		//Type URL of Facebook
		driver.get("https://www.facebook.com/");
		
		
		
		
		//Type Username & password
		driver.findElement(By.id("email")).sendKeys("abctest1234@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ashfgkhasgfkjsfh");
		
		//Click on login button
		driver.findElement(By.name("login")).click();
		
	}

}
