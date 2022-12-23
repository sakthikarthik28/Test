package testscenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ValidationTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/sakth/Downloads/QA-Selenium/QE%20-%20index.html");
		//Thread.sleep(3000);
		
		// verify if email and password fields are displayed
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

		driver.findElement(By.id("inputEmail")).sendKeys("abcd@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("inputPassword")).sendKeys("abc");
        Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"test-1-div\"]/form/button")).click();
		
	}}