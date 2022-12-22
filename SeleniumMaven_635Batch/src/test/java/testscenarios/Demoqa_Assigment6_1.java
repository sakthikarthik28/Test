package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa_Assigment6_1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		//driver.findElement(By.id("moved")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Moved")).click();

	}

}
