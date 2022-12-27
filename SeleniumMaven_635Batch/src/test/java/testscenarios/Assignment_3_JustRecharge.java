package testscenarios;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3_JustRecharge {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("Just124@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("Just123");
		//wait statement
		Thread.sleep(5000);
		//To retrive the console data, will use Scanner class
		
		//Create an object for existing java class[scanner]
		//CLASSNAME referenceName = new CLASSSNAME();
		Scanner s = new Scanner(System.in);
		driver.findElement(By.id("txtCaptcha")).sendKeys(s.next());
		
		driver.findElement(By.id("imgbtnSignin")).click();
	}

}
