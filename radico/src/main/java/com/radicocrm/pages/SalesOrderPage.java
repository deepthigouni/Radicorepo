package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class SalesOrderPage {
	
	@FindBy(xpath="//a[text()='Sales Orders']") private WebElement SalesPage;
	
	public SalesOrderPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	  
	public WebElement getSalesPage() {
		return SalesPage;
	}
	
	public void SalesPage()
	{
		SalesPage.click();
	}
	
	

}
