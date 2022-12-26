package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(2000);
		// Continue to Login
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(2000);

		// Login button
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(2000);

		// get the alert text
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);

		// click on alert ok button
		driver.switchTo().alert().accept();

		// click on new userlink
		driver.findElement(By.xpath("//*[@id=\"login_fields\"]/div[1]/div[2]/ul/li[1]/a ")).click();
		Thread.sleep(2000);

		// get the alert text
		String Register = driver.switchTo().alert().getText();
		System.out.println(Register);

		// click on alert ok button
		driver.switchTo().alert().accept();
	}
}
