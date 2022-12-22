package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");
		Thread.sleep(6000);

		// Click on First ClickMe button
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(4000);
		// Get the Alert Text
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		// Click on Alert OK button
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		// Click on Third click me button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(4000);
		// Get the Confirmationalert Text
		String Confirmationalert = driver.switchTo().alert().getText();
		System.out.println(Confirmationalert);
		// Click on Confirmationalert OK/Cancle button
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

	}

}
