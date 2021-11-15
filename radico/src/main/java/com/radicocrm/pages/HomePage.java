package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class HomePage {
	
	  @FindBy(xpath="//a[text()='Home']") private WebElement homepage;
	  
	
	  public HomePage()
		{
			PageFactory.initElements(BaseTest.driver,this);
		}
	  
	  public WebElement getHomepage()
	  {
		return homepage;
	  }
	  
	  public void clickHomepage()
	  {
		homepage.click();
	  }
	

	
	
	
	
	
	
	
	
	
	
	

}
