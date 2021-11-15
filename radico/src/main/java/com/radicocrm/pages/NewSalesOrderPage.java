package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class NewSalesOrderPage {
	
	@FindBy(xpath="//input[@value='New Sales Order']") WebElement newsales;
	
	public NewSalesOrderPage() {
		
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getNewsales() {
		return newsales;
	}

	public void clicknewsales() {
		
		newsales.click();
	}
	
	
}
