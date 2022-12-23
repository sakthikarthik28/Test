package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OnlineSBIAlertcondition {

public static void main(String[] args) throws Exception {
	
WebDriver driver;
driver = new ChromeDriver();

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
	}

}
