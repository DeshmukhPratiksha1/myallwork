package testcmp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginFunctinalityTest {
     
	    @Test
	    
       public void loginFuncTest() throws InterruptedException 
	    {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		LoginFunctionality fl = new LoginFunctionality(driver);
		
		fl.clickOnSignInButton();
		
		fl.enterMobile();
		
		Thread.sleep(2000);
		
		fl.SignInWithPassword();
		
		fl.passwordEnter();
		
		Thread.sleep(2000);

		fl.signIn();
		
		//	driver.close();

	}

}
