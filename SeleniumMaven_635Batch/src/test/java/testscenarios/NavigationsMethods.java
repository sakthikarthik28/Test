package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsMethods {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		// VErify the FB URL, [[get the current URL]]
		System.out.println(driver.getCurrentUrl());
//		String homepageURL = driver.getCurrentUrl();
//		System.out.println(homepageURL);
		// Get the page title
		System.out.println(driver.getTitle());

		// Click on forgot password link
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		// Get the page title
		System.out.println(driver.getTitle());

//		driver.findElement(By.name("email")).sendKeys("abctest1234@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("ashfgkhasgfkjsfh");
//		
//		//Click on Refresh icon
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		
//		//Move back to login screen using back icon
//		driver.navigate().back();
//		Thread.sleep(2000);
//
//		//Move forward to fb forgotpassword screen using forward icon
//		driver.navigate().forward();
	}

}
