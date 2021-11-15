package com.radicocrm.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class CustomerViewPage {

	@FindBy(xpath="//input[@value='New Sales Order']") private WebElement NewSales;
	
	
	public CustomerViewPage(){
		PageFactory.initElements(BaseTest.driver, this );
		
	}


	public WebElement getNewSales() {
		return NewSales;
	}
	
	
	
	
	
	
	
	
	
	
}
