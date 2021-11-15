package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class NewInvoiceOrderPage {
@FindBy(xpath="//input[@value='New Invoice']") WebElement newinvoice;
	
	public NewInvoiceOrderPage() {
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	
	public WebElement getNewInvoice() {
		return newinvoice;
	}
	
	public void clicknewInvoice() {
		newinvoice.click();
	}

}
