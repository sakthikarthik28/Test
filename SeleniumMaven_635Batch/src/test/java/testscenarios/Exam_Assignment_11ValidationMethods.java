package testscenarios;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam_Assignment_11ValidationMethods {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/nalla/OneDrive/Desktop/Selenium/Exam_14Oct2022/QE%20-%20index.html");
//Test1
		if (driver.findElement(By.id("inputEmail")).isDisplayed()) {
			System.out.println("Email address is displayed ");
		} else {
			System.out.println("Email address is  NOT displayed ");
		}
		if (driver.findElement(By.id("inputPassword")).isDisplayed()) {
			System.out.println("Password is displayed ");
		} else {
			System.out.println("Password is  NOT displayed ");
		}

		if (driver.findElement(By.xpath("//*[@id=\"test-1-div\"]/form/button")).isDisplayed()) {
			System.out.println("Signin button  is displayed ");
		} else {
			System.out.println("Signin button  is NOT displayed ");
		}

		driver.findElement(By.id("inputEmail")).sendKeys("jani123@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("jani123");
		// driver.findElement(By.xpath("//*[@id=\"test-1-div\"]/form/button")).click();
//Test4
		if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]")).isEnabled()) {
			System.out.println("Test4 given locater is enable state");

		} else {
			System.out.println("Teat4 given locater is NOT enable state");

		}
		if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[2]")).isEnabled()) {
			System.out.println("Test4 given locater is enable state");

		} else {
			System.out.println("Test4 given locater is NOT enable state");

		}
//Test5
		Thread.sleep(10000);
		if (driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).isEnabled()) {
			System.out.println("Test5 given locater is enable state, Before Click Action");

		} else {
			System.out.println(" Test5 given locater is NOT enable state, Before Click Action");
		}

		driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).click();
		// Get the text
		System.out.println("Test5 Text is: " + driver.findElement(By.id("test5-alert")).getText());
		if (driver.findElement(By.id("test5-alert")).getText().equals("You clicked a button!")) {
			System.out.println("Test is matching");
		} else {
			System.out.println("Test is NOT matching");
		}

		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).isEnabled()) {
			System.out.println("Test5 given locater is enable state, After Click Action");

		} else {
			System.out.println(" Test5 given locater is NOT enable state, After Click Action");

		}
//Test2
		System.out.println(" Test2***********************");
		String test2Data = driver.findElement(By.className("list-group")).getText();
		System.out.println(test2Data);

		// validate List Item 1 3, List Item 2 6, List Item 3 9
		if (test2Data.contains("List Item 2 6")) {
			System.out.println("List Item 2 6 is available in Test2 section");
		} else {
			System.out.println("'List Item 2 6' is NOT available in Test2 section");
		}
		// Assert that the second list item's value is set to "List Item 2"
		String abc = driver.findElement(By.xpath("//*[@id='test-2-div']/ul/li[2]")).getText();
		System.out.println("abc value is" + abc);
		if (abc.contains("List Item 2")) {
			System.out.println("the second list item's value is set to \"List Item 2\"");
		} else {
			System.out.println("the second list item's value is NOT set to \"List Item 2\"");
		}
		// Assert that the second list item's badge value is 6
		String abcd = driver.findElement(By.xpath("//*[@id='test-2-div']/ul/li[2]")).getText();
		if (abc.contains("6")) {
			System.out.println("that the second list item's badge value is 6");
		} else {
			System.out.println("that the second list item's badge value is NOT 6");
		}

		// Test6
		// Assert that the value of the cell is "Ventosanzap"
		getTableDataByRowAndColoumn(3,3);
	}

	// Customized method to call table data
	public static void getTableDataByRowAndColoumn(int rowNum, int coloumNum) {
		String tabledata = 
				driver.findElement(
						By.xpath("//table/tbody/tr[" + rowNum + "]/td[" + coloumNum + "]"))
				.getText();
		System.out.println("the table data is : " + tabledata);

		if (tabledata.equals("Ventosanzap")) {
			System.out.println("the value of the is matching with 'Ventosanzap'");
		} else {
			System.out.println("the value of the is Not matching with  'Ventosanzap'");
		}
	}
}
