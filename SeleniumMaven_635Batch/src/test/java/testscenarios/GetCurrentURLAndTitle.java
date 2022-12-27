package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURLAndTitle {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");

		// Get the title of webpage
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		// Click on Sign Up link
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(3000);
		// Get the title of webpage
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
