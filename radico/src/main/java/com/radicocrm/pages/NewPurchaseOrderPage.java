package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class NewPurchaseOrderPage {

	@FindBy(xpath="//input[@value='New Purchase Order']") WebElement newpurchase;
	
	public NewPurchaseOrderPage() {
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	
	public WebElement getNewpurchase() {
		return newpurchase;
	}
	
	public void clicknewPurchase() {
		newpurchase.click();
	}
	
}