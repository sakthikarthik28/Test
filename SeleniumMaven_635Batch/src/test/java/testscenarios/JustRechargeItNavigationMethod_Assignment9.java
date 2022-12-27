package testscenarios;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JustRechargeItNavigationMethod_Assignment9 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("txtUserName")).sendKeys("just1@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("654321");
		Scanner S= new Scanner(System.in);
		driver.findElement(By.id("txtCaptcha")).sendKeys(S.next());
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		//String homepageURL=driver.getCurrentUrl();
		//System.out.println(homepageURL);
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		//String homepageURL1=driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
