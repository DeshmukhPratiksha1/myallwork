package testcmp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageLogin {
	
	@Test
	
	public void login()
	{
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

	}

}
