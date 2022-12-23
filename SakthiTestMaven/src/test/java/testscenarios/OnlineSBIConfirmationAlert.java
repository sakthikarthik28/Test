package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineSBIConfirmationAlert {


		public static void main(String[] args) throws Exception {
			
		WebDriver driver;
		driver = new ChromeDriver();

//ASSIGNMENT ALERT
		
		//Navigate to SBIOnline
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");

		//Maximize the window
		driver.manage().window().maximize();

		//wait
		Thread.sleep(4000);

		//Click on Continue to login button
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(4000);

		//Click on Login button
		driver.findElement(By.xpath("//*[@id=\"Button2\"]")).click();
		Thread.sleep(3000);

		// Get the text
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);

		//click OK to accept	
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
//ASSIGNMENT CONFIRMATION ALERT
		
		
		//Click on New user link
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		Thread.sleep(4000);
		
		System.out.println("*********");
		
		// Get the text
		String ConfalertText = driver.switchTo().alert().getText();
		System.out.println(ConfalertText);
		
		//click OK to accept	
		//driver.switchTo().alert().accept();
		//Thread.sleep(4000);
		
		//click CANCEL to dismiss	
		driver.switchTo().alert().dismiss();
	
			}
}
