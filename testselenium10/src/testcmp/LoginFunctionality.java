package testcmp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionality {
	
	
	@FindBy(xpath = "//a[@class='sign-in']") 
	private WebElement signnButton;
	
	@FindBy(xpath = "(//*[@type='number'])[2]") 
	private WebElement enterMobileNumber;
	
	@FindBy(xpath = "(//*[@id='central-login-sign-in-with-password-span'])[2]") 
	private WebElement clickSignInWithPassword;
	
	@FindBy(xpath = "//*[@name='password']") 
	private WebElement enterPasswordField;
	
	
	@FindBy(xpath = "//*[@id='login-in-with-password']") 
	private WebElement clickOnSignIn;
	
	
	public LoginFunctionality(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInButton()
	{
		signnButton.click();
	
	}

	public void enterMobile()
	{
		enterMobileNumber.sendKeys("7385899190");
	
	}
	
	public void SignInWithPassword()
	{
		clickSignInWithPassword.click();
	
	}
	
	public void passwordEnter()
	{
		enterPasswordField.sendKeys("Anvesh@22");
	
	}
	
	public void signIn()
	{
		
		clickOnSignIn.click();
	
	}

}
