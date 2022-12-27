package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JriTesting {
	  WebDriver driver;

  
@Test
  public void TC_001() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.justrechargeit.com/");
	  }


  @Test
  public void TC_002() {
	
 driver.findElement(By.id("signup-link9")).click();
 System.out.println(driver.getCurrentUrl());
  }
  
  
  @Test
  public void TC_003() throws Exception {
	
 driver.findElement(By.id("imgbtnSubmit")).click();
 Thread.sleep(3000);
 String nameErrorMessage = driver.findElement(By.id("nameTD")).getText();
	System.out.println(nameErrorMessage);
	//Validate the error message
	if (nameErrorMessage.equals("Enter your name")) {
		System.out.println("Firstname error message has displayed successfully");
	} else {
		System.out.println("Firstname error message has NOT displayed");

}}
 
 
 @Test
 public void TC_004() throws Exception {
	
driver.findElement(By.id("signup_name")).sendKeys("aaaa");
driver.findElement(By.id("imgbtnSubmit")).click();
Thread.sleep(3000);
String mobileErrorMessage = driver.findElement(By.id("mobilenoTD")).getText();
System.out.println(mobileErrorMessage);
//Validate the error message
if (mobileErrorMessage.equals("Enter mobile no.")) {
	System.out.println("Mobile number error message has displayed successfully");
} else {
	System.out.println("Mobile number error message has NOT displayed");

}}
 
 
 @Test
 public void TC_005() throws Exception {
	
//driver.findElement(By.id("signup_name")).sendKeys("aaaa");
driver.findElement(By.id("signup_mobileno")).sendKeys("9840412345");
driver.findElement(By.id("imgbtnSubmit")).click();
Thread.sleep(3000);
String emailErrorMessage = driver.findElement(By.id("emailTD")).getText();
System.out.println(emailErrorMessage);
//Validate the error message
if (emailErrorMessage.equals("Enter your email id")) {
	System.out.println("Email error message has displayed successfully");
} else {
	System.out.println("Email error message has NOT displayed");
}
 }
 
 
@Test
public void TC_006() throws Exception {
	
//driver.findElement(By.id("signup_name")).sendKeys("aaaa");
//driver.findElement(By.id("signup_mobileno")).sendKeys("9840412345");
driver.findElement(By.id("signup_email")).sendKeys("aaaa@gmail.com");
driver.findElement(By.id("imgbtnSubmit")).click();
Thread.sleep(3000);
String PwdErrorMessage = driver.findElement(By.id("passwordTD")).getText();
System.out.println(PwdErrorMessage);
//Validate the error message


if (PwdErrorMessage.equals("Enter your password")) {
	 System.out.println("Pwd ErrorMessage displayed correcttly");
} else {
	 System.out.println("Pwd ErrorMessage not displayed correcttly");
 
}}
 


@Test
public void TC_007() throws Exception {
	
//driver.findElement(By.id("signup_name")).sendKeys("aaaa");
//driver.findElement(By.id("signup_mobileno")).sendKeys("9840412345");
//driver.findElement(By.id("signup_email")).sendKeys("aaaa@gmail.com");
Thread.sleep(3000);
driver.findElement(By.id("signup_password")).sendKeys("546325");
Thread.sleep(3000);
driver.findElement(By.id("imgbtnSubmit")).click();
Thread.sleep(3000);
String chkboxErrorMessage = driver.findElement(By.id("tdcondition")).getText();
System.out.println(chkboxErrorMessage);
//Validate the error message
if (chkboxErrorMessage.equals("Please agree to the terms & conditions")) {
	Thread.sleep(3000);
	System.out.println("chkbox error message has displayed successfully");
	
} else {
	System.out.println("chkbox error message has NOT displayed");


 }}


@Test
public void TC_008() throws Exception {
	
//driver.findElement(By.id("signup_name")).sendKeys("trghet");
Thread.sleep(1000);
//driver.findElement(By.id("signup_mobileno")).sendKeys("9194192345");
Thread.sleep(1000);
//driver.findElement(By.id("signup_email")).sendKeys("aaadsfurgga@gmail.com");
Thread.sleep(1000);
//driver.findElement(By.id("signup_password")).sendKeys("522825");
driver.navigate().refresh();
Thread.sleep(3000);
 }

@Test
public void TC_009() throws Exception {
	 
	  driver.get("https://www.justrechargeit.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.id("signup-link9")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("signup_name")).sendKeys("ewwqtt3er");
	  Thread.sleep(2000);
	  driver.findElement(By.id("signup_mobileno")).sendKeys("9194192345");
	  Thread.sleep(2000);
	  driver.findElement(By.id("signup_email")).sendKeys("ayytew@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.id("signup_password")).sendKeys("111161");
	  Thread.sleep(2000);
	  driver.findElement(By.id("checkbox")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("imgbtnSubmit")).click();
	  Thread.sleep(2000);
	  
	  
}
}
  










