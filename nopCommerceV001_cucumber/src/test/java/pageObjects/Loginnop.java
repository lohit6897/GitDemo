package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginnop {
	
	WebDriver ldriver;
	public Loginnop(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="Email")
	WebElement txtemail;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnlogin;
	@FindBy(css="a[href='Logout.php']")
	WebElement logout;
	
	
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}
	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clicksubmit()
	{
		btnlogin.click();
	}
	public void logoutb()
	{
		logout.click();
	}
	}



