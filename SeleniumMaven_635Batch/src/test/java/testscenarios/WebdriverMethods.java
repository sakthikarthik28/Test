package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(6000);
		
		// Gettext
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		String fnErrMsg =  driver.findElement(By.id("firstNameError")).getText();
		System.out.println(fnErrMsg);
		
		
		//Close the current window
		driver.close();
		

	}

}
