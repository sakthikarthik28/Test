package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRechargeIt {

	public static void main(String[] args) {
		// create webdriver object
		WebDriver driver;

		// browser open
		driver = new ChromeDriver();

		// Type URL of the application
		driver.get("https://www.justrechargeit.com/SignIn.aspx");

		// Enter Email id
		driver.findElement(By.name("txtUserName")).sendKeys("abcd123@gmail.com");
		//driver.findElement(By.name("txtUserName")).sendKeys("1234");

		// Enter password
		 //driver.findElement(By.name("txtPasswd")).sendKeys("455");
		driver.findElement(By.name("txtPasswd")).sendKeys("");

		// Enter captcha
		//driver.findElement(By.id("txtCaptcha")).sendKeys("200");
		driver.findElement(By.id("txtCaptcha")).sendKeys("100");

// Click on Secure sign in
		driver.findElement(By.id("imgbtnSignin")).click();

	}

}
