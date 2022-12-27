package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		//dropdown code
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Mar");
		
//		Select s = new Select(driver.findElement(By.name("birthday_month")));
//		s.selectByVisibleText("Mar");

	}

}
