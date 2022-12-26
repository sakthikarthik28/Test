package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TS_001_CreateNewAccount {
	WebDriver driver;

	@Test
	public void tc_001() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/");
	}

	@Test
	public void tc_002() throws Exception {
		driver.findElement(By.id("signup-link9")).click();
		// Get the current page URL
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
	}

	@Test
	public void tc_003() throws Exception {
		// Click on Create new account button without fill any data
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		String nameErrorMessage = driver.findElement(By.id("nameTD")).getText();
		System.out.println(nameErrorMessage);
		// Validate the error message
		if (nameErrorMessage.equals("Enter your name")) {
			System.out.println("Firstname error message has displayed successfully");
		} else {
			System.out.println("Firstname error message has NOT displayed");

		}

	}

	@Test
	public void tc_004() {
		System.out.println("tc_004");
	}

	@Test
	public void tc_005() {
		System.out.println("tc_005");
	}
}
