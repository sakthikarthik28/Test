package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://stqatools.com/demo/Windows.php");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a[3]/button")).click();
		//driver.close();
		driver.quit();
	}

}
