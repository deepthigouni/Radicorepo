package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class SignInPage {
   
	@FindBy (id="userName") private WebElement untb;
	@FindBy (id="passWord") private WebElement pwtb;
	@FindBy (xpath="//input[@title='Sign In']") private WebElement SignIn;
	
	public SignInPage()
	{
		PageFactory.initElements(BaseTest.driver, this );
	}
	
	public WebElement getuntb(){
		return untb;
		 
	}
	
	public WebElement getpwtb(){
		return pwtb;
		 
	}
	
	public WebElement getSignInPage() {
		return SignIn;
		
	}
	
	public void login(String un,String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		SignIn.click();
	}

	
}

 


