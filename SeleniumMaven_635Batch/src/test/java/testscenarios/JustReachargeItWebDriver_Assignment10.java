package testscenarios;

import java.awt.print.Printable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustReachargeItWebDriver_Assignment10 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("https://www.justrechargeit.com/SignUp.aspx");
		
		//get text error message
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(2000);	
		System.out.println(driver.findElement(By.className("errormsg")).getText());
		driver.findElement(By.name("signup_name")).sendKeys("Joshi");
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.className("errormsg")).getText());
		driver.findElement(By.name("signup_mobileno")).sendKeys("9821323454");
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.className("errormsg")).getText());
		driver.findElement(By.id("signup_email")).sendKeys("just1@gmail.comm");
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.className("errormsg")).getText());
		driver.findElement(By.id("signup_password")).sendKeys("654321");
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.className("errormsg")).getText());
		driver.findElement(By.id("checkbox")).click();
		Thread.sleep(2000);
		
		
	}

}
