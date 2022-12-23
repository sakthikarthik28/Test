package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://greenmountainpower.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		if(driver.findElement(By.xpath("//*[@id=\"site-navigation\"]/div[2]/div/div/button")).isEnabled())
		{
			System.out.println(" button is Enabled");
			}
			else
			{
				System.out.println(" button is not Enabled");
	}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"site-navigation\"]/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot Password?")).click();
	}
}

