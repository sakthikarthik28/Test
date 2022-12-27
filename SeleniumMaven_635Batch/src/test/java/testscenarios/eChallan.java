package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eChallan {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://echallan.tspolice.gov.in/publicview/");
		
		driver.findElement(By.id("REG_NO")).sendKeys("ap12ts1234");

	}

}
