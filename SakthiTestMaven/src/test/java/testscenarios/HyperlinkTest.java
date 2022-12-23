package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkTest {

	public static void main(String[] args) {
	
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home")).click();
		
		

	}

}
