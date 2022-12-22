package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4_CollegeWeekLive {

	public static void main(String[] args) throws Exception {
		// create webdriver object
		WebDriver driver;

		// Browser open
		driver = new ChromeDriver();

		// Type URL of CollegeWeekLive
		driver.get("https://collegeweeklive.com/go-signup/");
		// Exception in thread "main" org.openqa.selenium.NoSuchElementException: no
		// such element:
		// Unable to locate element: {"method":"css selector","selector":"#firstName"}

		// wait statement, user has given 6 second wait.
		//untill 6 sec over, eclipse won't do any action
		Thread.sleep(6000);

		// Type Firstname
		driver.findElement(By.id("firstName")).sendKeys("Hema");
		driver.findElement(By.id("lastName")).sendKeys("Sri");
		driver.findElement(By.name("emailAddress")).sendKeys("hemasri@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("9874563511");
		driver.findElement(By.name("password")).sendKeys("fsdf545");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("fsdf545");

		// click on checkboxes
		driver.findElement(By.name("questions[q_135]")).click();
		driver.findElement(By.name("questions[q_136]")).click();
		driver.findElement(By.name("questions[q_137]")).click();

		// click submit
		driver.findElement(By.className("submit")).click();
	}

}
