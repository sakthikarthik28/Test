package testscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup");
		
	}

}
